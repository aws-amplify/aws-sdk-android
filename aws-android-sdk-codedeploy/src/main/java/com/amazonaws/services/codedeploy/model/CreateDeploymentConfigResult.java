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
 * Represents the output of a <code>CreateDeploymentConfig</code> operation.
 * </p>
 */
public class CreateDeploymentConfigResult implements Serializable {
    /**
     * <p>
     * A unique deployment configuration ID.
     * </p>
     */
    private String deploymentConfigId;

    /**
     * <p>
     * A unique deployment configuration ID.
     * </p>
     *
     * @return <p>
     *         A unique deployment configuration ID.
     *         </p>
     */
    public String getDeploymentConfigId() {
        return deploymentConfigId;
    }

    /**
     * <p>
     * A unique deployment configuration ID.
     * </p>
     *
     * @param deploymentConfigId <p>
     *            A unique deployment configuration ID.
     *            </p>
     */
    public void setDeploymentConfigId(String deploymentConfigId) {
        this.deploymentConfigId = deploymentConfigId;
    }

    /**
     * <p>
     * A unique deployment configuration ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentConfigId <p>
     *            A unique deployment configuration ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentConfigResult withDeploymentConfigId(String deploymentConfigId) {
        this.deploymentConfigId = deploymentConfigId;
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
            sb.append("deploymentConfigId: " + getDeploymentConfigId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentConfigId() == null) ? 0 : getDeploymentConfigId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentConfigResult == false)
            return false;
        CreateDeploymentConfigResult other = (CreateDeploymentConfigResult) obj;

        if (other.getDeploymentConfigId() == null ^ this.getDeploymentConfigId() == null)
            return false;
        if (other.getDeploymentConfigId() != null
                && other.getDeploymentConfigId().equals(this.getDeploymentConfigId()) == false)
            return false;
        return true;
    }
}
