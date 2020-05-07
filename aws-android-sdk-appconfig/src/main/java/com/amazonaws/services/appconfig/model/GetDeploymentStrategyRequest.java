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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieve information about a deployment strategy. A deployment strategy
 * defines important criteria for rolling out your configuration to the
 * designated targets. A deployment strategy includes: the overall duration
 * required, a percentage of targets to receive the deployment during each
 * interval, an algorithm that defines how percentage grows, and bake time.
 * </p>
 */
public class GetDeploymentStrategyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([a-z0-9]{4,7}|arn:aws.*)<br/>
     */
    private String deploymentStrategyId;

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([a-z0-9]{4,7}|arn:aws.*)<br/>
     *
     * @return <p>
     *         The ID of the deployment strategy to get.
     *         </p>
     */
    public String getDeploymentStrategyId() {
        return deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([a-z0-9]{4,7}|arn:aws.*)<br/>
     *
     * @param deploymentStrategyId <p>
     *            The ID of the deployment strategy to get.
     *            </p>
     */
    public void setDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
    }

    /**
     * <p>
     * The ID of the deployment strategy to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([a-z0-9]{4,7}|arn:aws.*)<br/>
     *
     * @param deploymentStrategyId <p>
     *            The ID of the deployment strategy to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentStrategyRequest withDeploymentStrategyId(String deploymentStrategyId) {
        this.deploymentStrategyId = deploymentStrategyId;
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
        if (getDeploymentStrategyId() != null)
            sb.append("DeploymentStrategyId: " + getDeploymentStrategyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentStrategyId() == null) ? 0 : getDeploymentStrategyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentStrategyRequest == false)
            return false;
        GetDeploymentStrategyRequest other = (GetDeploymentStrategyRequest) obj;

        if (other.getDeploymentStrategyId() == null ^ this.getDeploymentStrategyId() == null)
            return false;
        if (other.getDeploymentStrategyId() != null
                && other.getDeploymentStrategyId().equals(this.getDeploymentStrategyId()) == false)
            return false;
        return true;
    }
}
