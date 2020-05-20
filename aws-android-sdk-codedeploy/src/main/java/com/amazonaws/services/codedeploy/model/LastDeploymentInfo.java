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
 * Information about the most recent attempted or successful deployment to a
 * deployment group.
 * </p>
 */
public class LastDeploymentInfo implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     */
    private String status;

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group was complete.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group started.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastDeploymentInfo withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @return <p>
     *         The status of the most recent deployment.
     *         </p>
     * @see DeploymentStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The status of the most recent deployment.
     *            </p>
     * @see DeploymentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The status of the most recent deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public LastDeploymentInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The status of the most recent deployment.
     *            </p>
     * @see DeploymentStatus
     */
    public void setStatus(DeploymentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the most recent deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Baking, Succeeded,
     * Failed, Stopped, Ready
     *
     * @param status <p>
     *            The status of the most recent deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentStatus
     */
    public LastDeploymentInfo withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group was complete.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the most recent deployment to the
     *         deployment group was complete.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group was complete.
     * </p>
     *
     * @param endTime <p>
     *            A timestamp that indicates when the most recent deployment to
     *            the deployment group was complete.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group was complete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            A timestamp that indicates when the most recent deployment to
     *            the deployment group was complete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastDeploymentInfo withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group started.
     * </p>
     *
     * @return <p>
     *         A timestamp that indicates when the most recent deployment to the
     *         deployment group started.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group started.
     * </p>
     *
     * @param createTime <p>
     *            A timestamp that indicates when the most recent deployment to
     *            the deployment group started.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the most recent deployment to the
     * deployment group started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            A timestamp that indicates when the most recent deployment to
     *            the deployment group started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LastDeploymentInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getEndTime() != null)
            sb.append("endTime: " + getEndTime() + ",");
        if (getCreateTime() != null)
            sb.append("createTime: " + getCreateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LastDeploymentInfo == false)
            return false;
        LastDeploymentInfo other = (LastDeploymentInfo) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        return true;
    }
}
