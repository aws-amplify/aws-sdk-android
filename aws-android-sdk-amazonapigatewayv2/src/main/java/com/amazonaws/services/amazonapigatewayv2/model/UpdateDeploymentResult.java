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

package com.amazonaws.services.amazonapigatewayv2.model;

import java.io.Serializable;

public class UpdateDeploymentResult implements Serializable {
    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     */
    private Boolean autoDeployed;

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     */
    private String deploymentStatus;

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     */
    private String deploymentStatusMessage;

    /**
     * <p>
     * The description for the deployment.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     *
     * @return <p>
     *         Specifies whether a deployment was automatically released.
     *         </p>
     */
    public Boolean isAutoDeployed() {
        return autoDeployed;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     *
     * @return <p>
     *         Specifies whether a deployment was automatically released.
     *         </p>
     */
    public Boolean getAutoDeployed() {
        return autoDeployed;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     *
     * @param autoDeployed <p>
     *            Specifies whether a deployment was automatically released.
     *            </p>
     */
    public void setAutoDeployed(Boolean autoDeployed) {
        this.autoDeployed = autoDeployed;
    }

    /**
     * <p>
     * Specifies whether a deployment was automatically released.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoDeployed <p>
     *            Specifies whether a deployment was automatically released.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentResult withAutoDeployed(Boolean autoDeployed) {
        this.autoDeployed = autoDeployed;
        return this;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     *
     * @return <p>
     *         The date and time when the Deployment resource was created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     *
     * @param createdDate <p>
     *            The date and time when the Deployment resource was created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the Deployment resource was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date and time when the Deployment resource was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentResult withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     *
     * @return <p>
     *         The identifier for the deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The identifier for the deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier for the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The identifier for the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentResult withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     *
     * @return <p>
     *         The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     *         </p>
     * @see DeploymentStatus
     */
    public String getDeploymentStatus() {
        return deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     *
     * @param deploymentStatus <p>
     *            The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     *            </p>
     * @see DeploymentStatus
     */
    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     *
     * @param deploymentStatus <p>
     *            The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public UpdateDeploymentResult withDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     *
     * @param deploymentStatus <p>
     *            The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     *            </p>
     * @see DeploymentStatus
     */
    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
    }

    /**
     * <p>
     * The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, FAILED, DEPLOYED
     *
     * @param deploymentStatus <p>
     *            The status of the deployment: PENDING, FAILED, or SUCCEEDED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public UpdateDeploymentResult withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     *
     * @return <p>
     *         May contain additional feedback on the status of an API
     *         deployment.
     *         </p>
     */
    public String getDeploymentStatusMessage() {
        return deploymentStatusMessage;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     *
     * @param deploymentStatusMessage <p>
     *            May contain additional feedback on the status of an API
     *            deployment.
     *            </p>
     */
    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * May contain additional feedback on the status of an API deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentStatusMessage <p>
     *            May contain additional feedback on the status of an API
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentResult withDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
        return this;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     *
     * @return <p>
     *         The description for the deployment.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     *
     * @param description <p>
     *            The description for the deployment.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description for the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDeploymentResult withDescription(String description) {
        this.description = description;
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
        if (getAutoDeployed() != null)
            sb.append("AutoDeployed: " + getAutoDeployed() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: " + getDeploymentStatus() + ",");
        if (getDeploymentStatusMessage() != null)
            sb.append("DeploymentStatusMessage: " + getDeploymentStatusMessage() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoDeployed() == null) ? 0 : getAutoDeployed().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentStatusMessage() == null) ? 0 : getDeploymentStatusMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentResult == false)
            return false;
        UpdateDeploymentResult other = (UpdateDeploymentResult) obj;

        if (other.getAutoDeployed() == null ^ this.getAutoDeployed() == null)
            return false;
        if (other.getAutoDeployed() != null
                && other.getAutoDeployed().equals(this.getAutoDeployed()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null
                && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentStatusMessage() == null ^ this.getDeploymentStatusMessage() == null)
            return false;
        if (other.getDeploymentStatusMessage() != null
                && other.getDeploymentStatusMessage().equals(this.getDeploymentStatusMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
