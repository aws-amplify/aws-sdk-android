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
 * Represents the output of a <code>GetDeploymentGroup</code> operation.
 * </p>
 */
public class GetDeploymentGroupResult implements Serializable {
    /**
     * <p>
     * Information about the deployment group.
     * </p>
     */
    private DeploymentGroupInfo deploymentGroupInfo;

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     *
     * @return <p>
     *         Information about the deployment group.
     *         </p>
     */
    public DeploymentGroupInfo getDeploymentGroupInfo() {
        return deploymentGroupInfo;
    }

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     *
     * @param deploymentGroupInfo <p>
     *            Information about the deployment group.
     *            </p>
     */
    public void setDeploymentGroupInfo(DeploymentGroupInfo deploymentGroupInfo) {
        this.deploymentGroupInfo = deploymentGroupInfo;
    }

    /**
     * <p>
     * Information about the deployment group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupInfo <p>
     *            Information about the deployment group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentGroupResult withDeploymentGroupInfo(DeploymentGroupInfo deploymentGroupInfo) {
        this.deploymentGroupInfo = deploymentGroupInfo;
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
        if (getDeploymentGroupInfo() != null)
            sb.append("deploymentGroupInfo: " + getDeploymentGroupInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentGroupInfo() == null) ? 0 : getDeploymentGroupInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentGroupResult == false)
            return false;
        GetDeploymentGroupResult other = (GetDeploymentGroupResult) obj;

        if (other.getDeploymentGroupInfo() == null ^ this.getDeploymentGroupInfo() == null)
            return false;
        if (other.getDeploymentGroupInfo() != null
                && other.getDeploymentGroupInfo().equals(this.getDeploymentGroupInfo()) == false)
            return false;
        return true;
    }
}
