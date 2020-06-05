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
 * Configuration settings of a canary deployment.
 * </p>
 */
public class CanarySettings implements Serializable {
    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     */
    private Double percentTraffic;

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new
     * stage variables introduced in the canary. These stage variables are
     * represented as a string-to-string map between stage variable names and
     * their values.
     * </p>
     */
    private java.util.Map<String, String> stageVariableOverrides;

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage
     * cache or not.
     * </p>
     */
    private Boolean useStageCache;

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     *
     * @return <p>
     *         The percent (0-100) of traffic diverted to a canary deployment.
     *         </p>
     */
    public Double getPercentTraffic() {
        return percentTraffic;
    }

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     *
     * @param percentTraffic <p>
     *            The percent (0-100) of traffic diverted to a canary
     *            deployment.
     *            </p>
     */
    public void setPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
    }

    /**
     * <p>
     * The percent (0-100) of traffic diverted to a canary deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentTraffic <p>
     *            The percent (0-100) of traffic diverted to a canary
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanarySettings withPercentTraffic(Double percentTraffic) {
        this.percentTraffic = percentTraffic;
        return this;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     *
     * @return <p>
     *         The ID of the canary deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The ID of the canary deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the canary deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The ID of the canary deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanarySettings withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new
     * stage variables introduced in the canary. These stage variables are
     * represented as a string-to-string map between stage variable names and
     * their values.
     * </p>
     *
     * @return <p>
     *         Stage variables overridden for a canary release deployment,
     *         including new stage variables introduced in the canary. These
     *         stage variables are represented as a string-to-string map between
     *         stage variable names and their values.
     *         </p>
     */
    public java.util.Map<String, String> getStageVariableOverrides() {
        return stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new
     * stage variables introduced in the canary. These stage variables are
     * represented as a string-to-string map between stage variable names and
     * their values.
     * </p>
     *
     * @param stageVariableOverrides <p>
     *            Stage variables overridden for a canary release deployment,
     *            including new stage variables introduced in the canary. These
     *            stage variables are represented as a string-to-string map
     *            between stage variable names and their values.
     *            </p>
     */
    public void setStageVariableOverrides(java.util.Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new
     * stage variables introduced in the canary. These stage variables are
     * represented as a string-to-string map between stage variable names and
     * their values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stageVariableOverrides <p>
     *            Stage variables overridden for a canary release deployment,
     *            including new stage variables introduced in the canary. These
     *            stage variables are represented as a string-to-string map
     *            between stage variable names and their values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanarySettings withStageVariableOverrides(
            java.util.Map<String, String> stageVariableOverrides) {
        this.stageVariableOverrides = stageVariableOverrides;
        return this;
    }

    /**
     * <p>
     * Stage variables overridden for a canary release deployment, including new
     * stage variables introduced in the canary. These stage variables are
     * represented as a string-to-string map between stage variable names and
     * their values.
     * </p>
     * <p>
     * The method adds a new key-value pair into stageVariableOverrides
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into stageVariableOverrides.
     * @param value The corresponding value of the entry to be added into
     *            stageVariableOverrides.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanarySettings addstageVariableOverridesEntry(String key, String value) {
        if (null == this.stageVariableOverrides) {
            this.stageVariableOverrides = new java.util.HashMap<String, String>();
        }
        if (this.stageVariableOverrides.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.stageVariableOverrides.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into stageVariableOverrides.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CanarySettings clearstageVariableOverridesEntries() {
        this.stageVariableOverrides = null;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage
     * cache or not.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether the canary deployment uses the
     *         stage cache or not.
     *         </p>
     */
    public Boolean isUseStageCache() {
        return useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage
     * cache or not.
     * </p>
     *
     * @return <p>
     *         A Boolean flag to indicate whether the canary deployment uses the
     *         stage cache or not.
     *         </p>
     */
    public Boolean getUseStageCache() {
        return useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage
     * cache or not.
     * </p>
     *
     * @param useStageCache <p>
     *            A Boolean flag to indicate whether the canary deployment uses
     *            the stage cache or not.
     *            </p>
     */
    public void setUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether the canary deployment uses the stage
     * cache or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useStageCache <p>
     *            A Boolean flag to indicate whether the canary deployment uses
     *            the stage cache or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanarySettings withUseStageCache(Boolean useStageCache) {
        this.useStageCache = useStageCache;
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
        if (getPercentTraffic() != null)
            sb.append("percentTraffic: " + getPercentTraffic() + ",");
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getStageVariableOverrides() != null)
            sb.append("stageVariableOverrides: " + getStageVariableOverrides() + ",");
        if (getUseStageCache() != null)
            sb.append("useStageCache: " + getUseStageCache());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPercentTraffic() == null) ? 0 : getPercentTraffic().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getStageVariableOverrides() == null) ? 0 : getStageVariableOverrides()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUseStageCache() == null) ? 0 : getUseStageCache().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanarySettings == false)
            return false;
        CanarySettings other = (CanarySettings) obj;

        if (other.getPercentTraffic() == null ^ this.getPercentTraffic() == null)
            return false;
        if (other.getPercentTraffic() != null
                && other.getPercentTraffic().equals(this.getPercentTraffic()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStageVariableOverrides() == null ^ this.getStageVariableOverrides() == null)
            return false;
        if (other.getStageVariableOverrides() != null
                && other.getStageVariableOverrides().equals(this.getStageVariableOverrides()) == false)
            return false;
        if (other.getUseStageCache() == null ^ this.getUseStageCache() == null)
            return false;
        if (other.getUseStageCache() != null
                && other.getUseStageCache().equals(this.getUseStageCache()) == false)
            return false;
        return true;
    }
}
