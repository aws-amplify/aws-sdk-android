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
 * Information about how traffic is rerouted to instances in a replacement
 * environment in a blue/green deployment.
 * </p>
 */
public class DeploymentReadyOption implements Serializable {
    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     */
    private String actionOnTimeout;

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green
     * deployment is changed to Stopped if rerouting is not started manually.
     * Applies only to the <code>STOP_DEPLOYMENT</code> option for
     * <code>actionOnTimeout</code>.
     * </p>
     */
    private Integer waitTimeInMinutes;

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     *
     * @return <p>
     *         Information about when to reroute traffic from an original
     *         environment to a replacement environment in a blue/green
     *         deployment.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CONTINUE_DEPLOYMENT: Register new instances with the load
     *         balancer immediately after the new application revision is
     *         installed on the instances in the replacement environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP_DEPLOYMENT: Do not register new instances with a load
     *         balancer unless traffic rerouting is started using
     *         <a>ContinueDeployment</a>. If traffic rerouting is not started
     *         before the end of the specified wait period, the deployment
     *         status is changed to Stopped.
     *         </p>
     *         </li>
     *         </ul>
     * @see DeploymentReadyAction
     */
    public String getActionOnTimeout() {
        return actionOnTimeout;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     *
     * @param actionOnTimeout <p>
     *            Information about when to reroute traffic from an original
     *            environment to a replacement environment in a blue/green
     *            deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CONTINUE_DEPLOYMENT: Register new instances with the load
     *            balancer immediately after the new application revision is
     *            installed on the instances in the replacement environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_DEPLOYMENT: Do not register new instances with a load
     *            balancer unless traffic rerouting is started using
     *            <a>ContinueDeployment</a>. If traffic rerouting is not started
     *            before the end of the specified wait period, the deployment
     *            status is changed to Stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeploymentReadyAction
     */
    public void setActionOnTimeout(String actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     *
     * @param actionOnTimeout <p>
     *            Information about when to reroute traffic from an original
     *            environment to a replacement environment in a blue/green
     *            deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CONTINUE_DEPLOYMENT: Register new instances with the load
     *            balancer immediately after the new application revision is
     *            installed on the instances in the replacement environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_DEPLOYMENT: Do not register new instances with a load
     *            balancer unless traffic rerouting is started using
     *            <a>ContinueDeployment</a>. If traffic rerouting is not started
     *            before the end of the specified wait period, the deployment
     *            status is changed to Stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentReadyAction
     */
    public DeploymentReadyOption withActionOnTimeout(String actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout;
        return this;
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     *
     * @param actionOnTimeout <p>
     *            Information about when to reroute traffic from an original
     *            environment to a replacement environment in a blue/green
     *            deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CONTINUE_DEPLOYMENT: Register new instances with the load
     *            balancer immediately after the new application revision is
     *            installed on the instances in the replacement environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_DEPLOYMENT: Do not register new instances with a load
     *            balancer unless traffic rerouting is started using
     *            <a>ContinueDeployment</a>. If traffic rerouting is not started
     *            before the end of the specified wait period, the deployment
     *            status is changed to Stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @see DeploymentReadyAction
     */
    public void setActionOnTimeout(DeploymentReadyAction actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout.toString();
    }

    /**
     * <p>
     * Information about when to reroute traffic from an original environment to
     * a replacement environment in a blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * CONTINUE_DEPLOYMENT: Register new instances with the load balancer
     * immediately after the new application revision is installed on the
     * instances in the replacement environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP_DEPLOYMENT: Do not register new instances with a load balancer
     * unless traffic rerouting is started using <a>ContinueDeployment</a>. If
     * traffic rerouting is not started before the end of the specified wait
     * period, the deployment status is changed to Stopped.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUE_DEPLOYMENT, STOP_DEPLOYMENT
     *
     * @param actionOnTimeout <p>
     *            Information about when to reroute traffic from an original
     *            environment to a replacement environment in a blue/green
     *            deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            CONTINUE_DEPLOYMENT: Register new instances with the load
     *            balancer immediately after the new application revision is
     *            installed on the instances in the replacement environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STOP_DEPLOYMENT: Do not register new instances with a load
     *            balancer unless traffic rerouting is started using
     *            <a>ContinueDeployment</a>. If traffic rerouting is not started
     *            before the end of the specified wait period, the deployment
     *            status is changed to Stopped.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentReadyAction
     */
    public DeploymentReadyOption withActionOnTimeout(DeploymentReadyAction actionOnTimeout) {
        this.actionOnTimeout = actionOnTimeout.toString();
        return this;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green
     * deployment is changed to Stopped if rerouting is not started manually.
     * Applies only to the <code>STOP_DEPLOYMENT</code> option for
     * <code>actionOnTimeout</code>.
     * </p>
     *
     * @return <p>
     *         The number of minutes to wait before the status of a blue/green
     *         deployment is changed to Stopped if rerouting is not started
     *         manually. Applies only to the <code>STOP_DEPLOYMENT</code> option
     *         for <code>actionOnTimeout</code>.
     *         </p>
     */
    public Integer getWaitTimeInMinutes() {
        return waitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green
     * deployment is changed to Stopped if rerouting is not started manually.
     * Applies only to the <code>STOP_DEPLOYMENT</code> option for
     * <code>actionOnTimeout</code>.
     * </p>
     *
     * @param waitTimeInMinutes <p>
     *            The number of minutes to wait before the status of a
     *            blue/green deployment is changed to Stopped if rerouting is
     *            not started manually. Applies only to the
     *            <code>STOP_DEPLOYMENT</code> option for
     *            <code>actionOnTimeout</code>.
     *            </p>
     */
    public void setWaitTimeInMinutes(Integer waitTimeInMinutes) {
        this.waitTimeInMinutes = waitTimeInMinutes;
    }

    /**
     * <p>
     * The number of minutes to wait before the status of a blue/green
     * deployment is changed to Stopped if rerouting is not started manually.
     * Applies only to the <code>STOP_DEPLOYMENT</code> option for
     * <code>actionOnTimeout</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param waitTimeInMinutes <p>
     *            The number of minutes to wait before the status of a
     *            blue/green deployment is changed to Stopped if rerouting is
     *            not started manually. Applies only to the
     *            <code>STOP_DEPLOYMENT</code> option for
     *            <code>actionOnTimeout</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentReadyOption withWaitTimeInMinutes(Integer waitTimeInMinutes) {
        this.waitTimeInMinutes = waitTimeInMinutes;
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
        if (getActionOnTimeout() != null)
            sb.append("actionOnTimeout: " + getActionOnTimeout() + ",");
        if (getWaitTimeInMinutes() != null)
            sb.append("waitTimeInMinutes: " + getWaitTimeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionOnTimeout() == null) ? 0 : getActionOnTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getWaitTimeInMinutes() == null) ? 0 : getWaitTimeInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentReadyOption == false)
            return false;
        DeploymentReadyOption other = (DeploymentReadyOption) obj;

        if (other.getActionOnTimeout() == null ^ this.getActionOnTimeout() == null)
            return false;
        if (other.getActionOnTimeout() != null
                && other.getActionOnTimeout().equals(this.getActionOnTimeout()) == false)
            return false;
        if (other.getWaitTimeInMinutes() == null ^ this.getWaitTimeInMinutes() == null)
            return false;
        if (other.getWaitTimeInMinutes() != null
                && other.getWaitTimeInMinutes().equals(this.getWaitTimeInMinutes()) == false)
            return false;
        return true;
    }
}
