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
 * Represents the output of a <code>GetDeployment</code> operation.
 * </p>
 */
public class GetDeploymentResult implements Serializable {
    /**
     * <p>
     * Information about the deployment.
     * </p>
     */
    private DeploymentInfo deploymentInfo;

    /**
     * <p>
     * Information about the deployment.
     * </p>
     *
     * @return <p>
     *         Information about the deployment.
     *         </p>
     */
    public DeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    /**
     * <p>
     * Information about the deployment.
     * </p>
     *
     * @param deploymentInfo <p>
     *            Information about the deployment.
     *            </p>
     */
    public void setDeploymentInfo(DeploymentInfo deploymentInfo) {
        this.deploymentInfo = deploymentInfo;
    }

    /**
     * <p>
     * Information about the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentInfo <p>
     *            Information about the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentResult withDeploymentInfo(DeploymentInfo deploymentInfo) {
        this.deploymentInfo = deploymentInfo;
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
        if (getDeploymentInfo() != null)
            sb.append("deploymentInfo: " + getDeploymentInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentInfo() == null) ? 0 : getDeploymentInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentResult == false)
            return false;
        GetDeploymentResult other = (GetDeploymentResult) obj;

        if (other.getDeploymentInfo() == null ^ this.getDeploymentInfo() == null)
            return false;
        if (other.getDeploymentInfo() != null
                && other.getDeploymentInfo().equals(this.getDeploymentInfo()) == false)
            return false;
        return true;
    }
}
