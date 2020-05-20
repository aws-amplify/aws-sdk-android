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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For a blue/green deployment, starts the process of rerouting traffic from
 * instances in the original environment to instances in the replacement
 * environment without waiting for a specified wait time to elapse. (Traffic
 * rerouting, which is achieved by registering instances in the replacement
 * environment with the load balancer, can start as soon as all instances have a
 * status of Ready.)
 * </p>
 */
public class ContinueDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start
     * rerouting traffic to the replacement environment.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     */
    private String deploymentWaitType;

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start
     * rerouting traffic to the replacement environment.
     * </p>
     *
     * @return <p>
     *         The unique ID of a blue/green deployment for which you want to
     *         start rerouting traffic to the replacement environment.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start
     * rerouting traffic to the replacement environment.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a blue/green deployment for which you want to
     *            start rerouting traffic to the replacement environment.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a blue/green deployment for which you want to start
     * rerouting traffic to the replacement environment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a blue/green deployment for which you want to
     *            start rerouting traffic to the replacement environment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ContinueDeploymentRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     *
     * @return <p>
     *         The status of the deployment's waiting period.
     *         <code>READY_WAIT</code> indicates that the deployment is ready to
     *         start shifting traffic. <code>TERMINATION_WAIT</code> indicates
     *         that the traffic is shifted, but the original target is not
     *         terminated.
     *         </p>
     * @see DeploymentWaitType
     */
    public String getDeploymentWaitType() {
        return deploymentWaitType;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     *
     * @param deploymentWaitType <p>
     *            The status of the deployment's waiting period.
     *            <code>READY_WAIT</code> indicates that the deployment is ready
     *            to start shifting traffic. <code>TERMINATION_WAIT</code>
     *            indicates that the traffic is shifted, but the original target
     *            is not terminated.
     *            </p>
     * @see DeploymentWaitType
     */
    public void setDeploymentWaitType(String deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     *
     * @param deploymentWaitType <p>
     *            The status of the deployment's waiting period.
     *            <code>READY_WAIT</code> indicates that the deployment is ready
     *            to start shifting traffic. <code>TERMINATION_WAIT</code>
     *            indicates that the traffic is shifted, but the original target
     *            is not terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentWaitType
     */
    public ContinueDeploymentRequest withDeploymentWaitType(String deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType;
        return this;
    }

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     *
     * @param deploymentWaitType <p>
     *            The status of the deployment's waiting period.
     *            <code>READY_WAIT</code> indicates that the deployment is ready
     *            to start shifting traffic. <code>TERMINATION_WAIT</code>
     *            indicates that the traffic is shifted, but the original target
     *            is not terminated.
     *            </p>
     * @see DeploymentWaitType
     */
    public void setDeploymentWaitType(DeploymentWaitType deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType.toString();
    }

    /**
     * <p>
     * The status of the deployment's waiting period. <code>READY_WAIT</code>
     * indicates that the deployment is ready to start shifting traffic.
     * <code>TERMINATION_WAIT</code> indicates that the traffic is shifted, but
     * the original target is not terminated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>READY_WAIT, TERMINATION_WAIT
     *
     * @param deploymentWaitType <p>
     *            The status of the deployment's waiting period.
     *            <code>READY_WAIT</code> indicates that the deployment is ready
     *            to start shifting traffic. <code>TERMINATION_WAIT</code>
     *            indicates that the traffic is shifted, but the original target
     *            is not terminated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentWaitType
     */
    public ContinueDeploymentRequest withDeploymentWaitType(DeploymentWaitType deploymentWaitType) {
        this.deploymentWaitType = deploymentWaitType.toString();
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
        if (getDeploymentWaitType() != null)
            sb.append("deploymentWaitType: " + getDeploymentWaitType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentWaitType() == null) ? 0 : getDeploymentWaitType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinueDeploymentRequest == false)
            return false;
        ContinueDeploymentRequest other = (ContinueDeploymentRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentWaitType() == null ^ this.getDeploymentWaitType() == null)
            return false;
        if (other.getDeploymentWaitType() != null
                && other.getDeploymentWaitType().equals(this.getDeploymentWaitType()) == false)
            return false;
        return true;
    }
}
