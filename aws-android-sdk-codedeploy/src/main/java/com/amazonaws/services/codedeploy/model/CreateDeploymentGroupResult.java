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
 * Represents the output of a <code>CreateDeploymentGroup</code> operation.
 * </p>
 */
public class CreateDeploymentGroupResult implements Serializable {
    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     */
    private String deploymentGroupId;

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     *
     * @return <p>
     *         A unique deployment group ID.
     *         </p>
     */
    public String getDeploymentGroupId() {
        return deploymentGroupId;
    }

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     *
     * @param deploymentGroupId <p>
     *            A unique deployment group ID.
     *            </p>
     */
    public void setDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
    }

    /**
     * <p>
     * A unique deployment group ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupId <p>
     *            A unique deployment group ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDeploymentGroupResult withDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
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
        if (getDeploymentGroupId() != null)
            sb.append("deploymentGroupId: " + getDeploymentGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentGroupId() == null) ? 0 : getDeploymentGroupId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentGroupResult == false)
            return false;
        CreateDeploymentGroupResult other = (CreateDeploymentGroupResult) obj;

        if (other.getDeploymentGroupId() == null ^ this.getDeploymentGroupId() == null)
            return false;
        if (other.getDeploymentGroupId() != null
                && other.getDeploymentGroupId().equals(this.getDeploymentGroupId()) == false)
            return false;
        return true;
    }
}
