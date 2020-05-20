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
 * Represents the output of a <code>GetDeploymentConfig</code> operation.
 * </p>
 */
public class GetDeploymentConfigResult implements Serializable {
    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     */
    private DeploymentConfigInfo deploymentConfigInfo;

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     *
     * @return <p>
     *         Information about the deployment configuration.
     *         </p>
     */
    public DeploymentConfigInfo getDeploymentConfigInfo() {
        return deploymentConfigInfo;
    }

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     *
     * @param deploymentConfigInfo <p>
     *            Information about the deployment configuration.
     *            </p>
     */
    public void setDeploymentConfigInfo(DeploymentConfigInfo deploymentConfigInfo) {
        this.deploymentConfigInfo = deploymentConfigInfo;
    }

    /**
     * <p>
     * Information about the deployment configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfigInfo <p>
     *            Information about the deployment configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentConfigResult withDeploymentConfigInfo(
            DeploymentConfigInfo deploymentConfigInfo) {
        this.deploymentConfigInfo = deploymentConfigInfo;
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
        if (getDeploymentConfigInfo() != null)
            sb.append("deploymentConfigInfo: " + getDeploymentConfigInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentConfigInfo() == null) ? 0 : getDeploymentConfigInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentConfigResult == false)
            return false;
        GetDeploymentConfigResult other = (GetDeploymentConfigResult) obj;

        if (other.getDeploymentConfigInfo() == null ^ this.getDeploymentConfigInfo() == null)
            return false;
        if (other.getDeploymentConfigInfo() != null
                && other.getDeploymentConfigInfo().equals(this.getDeploymentConfigInfo()) == false)
            return false;
        return true;
    }
}
