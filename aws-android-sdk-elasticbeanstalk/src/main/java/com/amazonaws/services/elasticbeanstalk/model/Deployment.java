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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an application version deployment.
 * </p>
 */
public class Deployment implements Serializable {
    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     */
    private String versionLabel;

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you
     * deploy source code or change instance configuration settings.
     * </p>
     */
    private Long deploymentId;

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     */
    private java.util.Date deploymentTime;

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     *
     * @return <p>
     *         The version label of the application version in the deployment.
     *         </p>
     */
    public String getVersionLabel() {
        return versionLabel;
    }

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     *
     * @param versionLabel <p>
     *            The version label of the application version in the
     *            deployment.
     *            </p>
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The version label of the application version in the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLabel <p>
     *            The version label of the application version in the
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you
     * deploy source code or change instance configuration settings.
     * </p>
     *
     * @return <p>
     *         The ID of the deployment. This number increases by one each time
     *         that you deploy source code or change instance configuration
     *         settings.
     *         </p>
     */
    public Long getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you
     * deploy source code or change instance configuration settings.
     * </p>
     *
     * @param deploymentId <p>
     *            The ID of the deployment. This number increases by one each
     *            time that you deploy source code or change instance
     *            configuration settings.
     *            </p>
     */
    public void setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the deployment. This number increases by one each time that you
     * deploy source code or change instance configuration settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The ID of the deployment. This number increases by one each
     *            time that you deploy source code or change instance
     *            configuration settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The status of the deployment:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>In Progress</code> : The deployment is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deployed</code> : The deployment succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> : The deployment failed.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            The status of the deployment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>In Progress</code> : The deployment is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deployed</code> : The deployment succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> : The deployment failed.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the deployment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>In Progress</code> : The deployment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deployed</code> : The deployment succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> : The deployment failed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the deployment:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>In Progress</code> : The deployment is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Deployed</code> : The deployment succeeded.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Failed</code> : The deployment failed.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     *
     * @return <p>
     *         For in-progress deployments, the time that the deployment
     *         started.
     *         </p>
     *         <p>
     *         For completed deployments, the time that the deployment ended.
     *         </p>
     */
    public java.util.Date getDeploymentTime() {
        return deploymentTime;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     *
     * @param deploymentTime <p>
     *            For in-progress deployments, the time that the deployment
     *            started.
     *            </p>
     *            <p>
     *            For completed deployments, the time that the deployment ended.
     *            </p>
     */
    public void setDeploymentTime(java.util.Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    /**
     * <p>
     * For in-progress deployments, the time that the deployment started.
     * </p>
     * <p>
     * For completed deployments, the time that the deployment ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTime <p>
     *            For in-progress deployments, the time that the deployment
     *            started.
     *            </p>
     *            <p>
     *            For completed deployments, the time that the deployment ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Deployment withDeploymentTime(java.util.Date deploymentTime) {
        this.deploymentTime = deploymentTime;
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
        if (getVersionLabel() != null)
            sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getDeploymentTime() != null)
            sb.append("DeploymentTime: " + getDeploymentTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentTime() == null) ? 0 : getDeploymentTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deployment == false)
            return false;
        Deployment other = (Deployment) obj;

        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null
                && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDeploymentTime() == null ^ this.getDeploymentTime() == null)
            return false;
        if (other.getDeploymentTime() != null
                && other.getDeploymentTime().equals(this.getDeploymentTime()) == false)
            return false;
        return true;
    }
}
