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
 * Represents the output of a <code>BatchGetDeploymentGroups</code> operation.
 * </p>
 */
public class BatchGetDeploymentGroupsResult implements Serializable {
    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     */
    private java.util.List<DeploymentGroupInfo> deploymentGroupsInfo;

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     *
     * @return <p>
     *         Information about the deployment groups.
     *         </p>
     */
    public java.util.List<DeploymentGroupInfo> getDeploymentGroupsInfo() {
        return deploymentGroupsInfo;
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     *
     * @param deploymentGroupsInfo <p>
     *            Information about the deployment groups.
     *            </p>
     */
    public void setDeploymentGroupsInfo(
            java.util.Collection<DeploymentGroupInfo> deploymentGroupsInfo) {
        if (deploymentGroupsInfo == null) {
            this.deploymentGroupsInfo = null;
            return;
        }

        this.deploymentGroupsInfo = new java.util.ArrayList<DeploymentGroupInfo>(
                deploymentGroupsInfo);
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupsInfo <p>
     *            Information about the deployment groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsResult withDeploymentGroupsInfo(
            DeploymentGroupInfo... deploymentGroupsInfo) {
        if (getDeploymentGroupsInfo() == null) {
            this.deploymentGroupsInfo = new java.util.ArrayList<DeploymentGroupInfo>(
                    deploymentGroupsInfo.length);
        }
        for (DeploymentGroupInfo value : deploymentGroupsInfo) {
            this.deploymentGroupsInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the deployment groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentGroupsInfo <p>
     *            Information about the deployment groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsResult withDeploymentGroupsInfo(
            java.util.Collection<DeploymentGroupInfo> deploymentGroupsInfo) {
        setDeploymentGroupsInfo(deploymentGroupsInfo);
        return this;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @return <p>
     *         Information about errors that might have occurred during the API
     *         call.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Information about errors that might have occurred during the API call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            Information about errors that might have occurred during the
     *            API call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentGroupsResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getDeploymentGroupsInfo() != null)
            sb.append("deploymentGroupsInfo: " + getDeploymentGroupsInfo() + ",");
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentGroupsInfo() == null) ? 0 : getDeploymentGroupsInfo().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentGroupsResult == false)
            return false;
        BatchGetDeploymentGroupsResult other = (BatchGetDeploymentGroupsResult) obj;

        if (other.getDeploymentGroupsInfo() == null ^ this.getDeploymentGroupsInfo() == null)
            return false;
        if (other.getDeploymentGroupsInfo() != null
                && other.getDeploymentGroupsInfo().equals(this.getDeploymentGroupsInfo()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
