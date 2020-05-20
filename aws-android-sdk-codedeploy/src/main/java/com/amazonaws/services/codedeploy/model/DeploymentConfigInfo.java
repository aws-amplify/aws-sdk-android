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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment configuration.
 * </p>
 */
public class DeploymentConfigInfo implements Serializable {
    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     */
    private String deploymentConfigId;

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     */
    private MinimumHealthyHosts minimumHealthyHosts;

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     */
    private String computePlatform;

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * Used for deployments with a Lambda or ECS compute platform only.
     * </p>
     */
    private TrafficRoutingConfig trafficRoutingConfig;

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     *
     * @return <p>
     *         The deployment configuration ID.
     *         </p>
     */
    public String getDeploymentConfigId() {
        return deploymentConfigId;
    }

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     *
     * @param deploymentConfigId <p>
     *            The deployment configuration ID.
     *            </p>
     */
    public void setDeploymentConfigId(String deploymentConfigId) {
        this.deploymentConfigId = deploymentConfigId;
    }

    /**
     * <p>
     * The deployment configuration ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfigId <p>
     *            The deployment configuration ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfigInfo withDeploymentConfigId(String deploymentConfigId) {
        this.deploymentConfigId = deploymentConfigId;
        return this;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The deployment configuration name.
     *         </p>
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The deployment configuration name.
     *            </p>
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName <p>
     *            The deployment configuration name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfigInfo withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     *
     * @return <p>
     *         Information about the number or percentage of minimum healthy
     *         instance.
     *         </p>
     */
    public MinimumHealthyHosts getMinimumHealthyHosts() {
        return minimumHealthyHosts;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     *
     * @param minimumHealthyHosts <p>
     *            Information about the number or percentage of minimum healthy
     *            instance.
     *            </p>
     */
    public void setMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
    }

    /**
     * <p>
     * Information about the number or percentage of minimum healthy instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumHealthyHosts <p>
     *            Information about the number or percentage of minimum healthy
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfigInfo withMinimumHealthyHosts(MinimumHealthyHosts minimumHealthyHosts) {
        this.minimumHealthyHosts = minimumHealthyHosts;
        return this;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     *
     * @return <p>
     *         The time at which the deployment configuration was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     *
     * @param createTime <p>
     *            The time at which the deployment configuration was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the deployment configuration was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time at which the deployment configuration was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfigInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @return <p>
     *         The destination platform type for the deployment (
     *         <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>).
     *         </p>
     * @see ComputePlatform
     */
    public String getComputePlatform() {
        return computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public DeploymentConfigInfo withComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @see ComputePlatform
     */
    public void setComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code>,
     * <code>Server</code>, or <code>ECS</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Server, Lambda, ECS
     *
     * @param computePlatform <p>
     *            The destination platform type for the deployment (
     *            <code>Lambda</code>, <code>Server</code>, or <code>ECS</code>
     *            ).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputePlatform
     */
    public DeploymentConfigInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * Used for deployments with a Lambda or ECS compute platform only.
     * </p>
     *
     * @return <p>
     *         The configuration that specifies how the deployment traffic is
     *         routed. Used for deployments with a Lambda or ECS compute
     *         platform only.
     *         </p>
     */
    public TrafficRoutingConfig getTrafficRoutingConfig() {
        return trafficRoutingConfig;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * Used for deployments with a Lambda or ECS compute platform only.
     * </p>
     *
     * @param trafficRoutingConfig <p>
     *            The configuration that specifies how the deployment traffic is
     *            routed. Used for deployments with a Lambda or ECS compute
     *            platform only.
     *            </p>
     */
    public void setTrafficRoutingConfig(TrafficRoutingConfig trafficRoutingConfig) {
        this.trafficRoutingConfig = trafficRoutingConfig;
    }

    /**
     * <p>
     * The configuration that specifies how the deployment traffic is routed.
     * Used for deployments with a Lambda or ECS compute platform only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficRoutingConfig <p>
     *            The configuration that specifies how the deployment traffic is
     *            routed. Used for deployments with a Lambda or ECS compute
     *            platform only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentConfigInfo withTrafficRoutingConfig(TrafficRoutingConfig trafficRoutingConfig) {
        this.trafficRoutingConfig = trafficRoutingConfig;
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
        if (getDeploymentConfigId() != null)
            sb.append("deploymentConfigId: " + getDeploymentConfigId() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("deploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getMinimumHealthyHosts() != null)
            sb.append("minimumHealthyHosts: " + getMinimumHealthyHosts() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime() + ",");
        if (getComputePlatform() != null)
            sb.append("computePlatform: " + getComputePlatform() + ",");
        if (getTrafficRoutingConfig() != null)
            sb.append("trafficRoutingConfig: " + getTrafficRoutingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentConfigId() == null) ? 0 : getDeploymentConfigId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumHealthyHosts() == null) ? 0 : getMinimumHealthyHosts().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode
                + ((getTrafficRoutingConfig() == null) ? 0 : getTrafficRoutingConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentConfigInfo == false)
            return false;
        DeploymentConfigInfo other = (DeploymentConfigInfo) obj;

        if (other.getDeploymentConfigId() == null ^ this.getDeploymentConfigId() == null)
            return false;
        if (other.getDeploymentConfigId() != null
                && other.getDeploymentConfigId().equals(this.getDeploymentConfigId()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null
                && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getMinimumHealthyHosts() == null ^ this.getMinimumHealthyHosts() == null)
            return false;
        if (other.getMinimumHealthyHosts() != null
                && other.getMinimumHealthyHosts().equals(this.getMinimumHealthyHosts()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null
                && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getTrafficRoutingConfig() == null ^ this.getTrafficRoutingConfig() == null)
            return false;
        if (other.getTrafficRoutingConfig() != null
                && other.getTrafficRoutingConfig().equals(this.getTrafficRoutingConfig()) == false)
            return false;
        return true;
    }
}
