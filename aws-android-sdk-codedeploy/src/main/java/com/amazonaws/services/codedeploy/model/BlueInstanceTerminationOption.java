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
 * Information about whether instances in the original environment are
 * terminated when a blue/green deployment is successful.
 * <code>BlueInstanceTerminationOption</code> does not apply to Lambda
 * deployments.
 * </p>
 */
public class BlueInstanceTerminationOption implements Serializable {
    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     */
    private String action;

    /**
     * <p>
     * For an Amazon EC2 deployment, the number of minutes to wait after a
     * successful blue/green deployment before terminating instances from the
     * original environment.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the number of minutes before deleting the
     * original (blue) task set. During an Amazon ECS deployment, CodeDeploy
     * shifts traffic from the original (blue) task set to a replacement (green)
     * task set.
     * </p>
     * <p>
     * The maximum setting is 2880 minutes (2 days).
     * </p>
     */
    private Integer terminationWaitTimeInMinutes;

    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     *
     * @return <p>
     *         The action to take on instances in the original environment after
     *         a successful blue/green deployment.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TERMINATE</code>: Instances are terminated after a
     *         specified wait time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KEEP_ALIVE</code>: Instances are left running after they
     *         are deregistered from the load balancer and removed from the
     *         deployment group.
     *         </p>
     *         </li>
     *         </ul>
     * @see InstanceAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     *
     * @param action <p>
     *            The action to take on instances in the original environment
     *            after a successful blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TERMINATE</code>: Instances are terminated after a
     *            specified wait time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEEP_ALIVE</code>: Instances are left running after they
     *            are deregistered from the load balancer and removed from the
     *            deployment group.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     *
     * @param action <p>
     *            The action to take on instances in the original environment
     *            after a successful blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TERMINATE</code>: Instances are terminated after a
     *            specified wait time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEEP_ALIVE</code>: Instances are left running after they
     *            are deregistered from the load balancer and removed from the
     *            deployment group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAction
     */
    public BlueInstanceTerminationOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     *
     * @param action <p>
     *            The action to take on instances in the original environment
     *            after a successful blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TERMINATE</code>: Instances are terminated after a
     *            specified wait time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEEP_ALIVE</code>: Instances are left running after they
     *            are deregistered from the load balancer and removed from the
     *            deployment group.
     *            </p>
     *            </li>
     *            </ul>
     * @see InstanceAction
     */
    public void setAction(InstanceAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to take on instances in the original environment after a
     * successful blue/green deployment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TERMINATE</code>: Instances are terminated after a specified wait
     * time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KEEP_ALIVE</code>: Instances are left running after they are
     * deregistered from the load balancer and removed from the deployment
     * group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, KEEP_ALIVE
     *
     * @param action <p>
     *            The action to take on instances in the original environment
     *            after a successful blue/green deployment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TERMINATE</code>: Instances are terminated after a
     *            specified wait time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KEEP_ALIVE</code>: Instances are left running after they
     *            are deregistered from the load balancer and removed from the
     *            deployment group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAction
     */
    public BlueInstanceTerminationOption withAction(InstanceAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * For an Amazon EC2 deployment, the number of minutes to wait after a
     * successful blue/green deployment before terminating instances from the
     * original environment.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the number of minutes before deleting the
     * original (blue) task set. During an Amazon ECS deployment, CodeDeploy
     * shifts traffic from the original (blue) task set to a replacement (green)
     * task set.
     * </p>
     * <p>
     * The maximum setting is 2880 minutes (2 days).
     * </p>
     *
     * @return <p>
     *         For an Amazon EC2 deployment, the number of minutes to wait after
     *         a successful blue/green deployment before terminating instances
     *         from the original environment.
     *         </p>
     *         <p>
     *         For an Amazon ECS deployment, the number of minutes before
     *         deleting the original (blue) task set. During an Amazon ECS
     *         deployment, CodeDeploy shifts traffic from the original (blue)
     *         task set to a replacement (green) task set.
     *         </p>
     *         <p>
     *         The maximum setting is 2880 minutes (2 days).
     *         </p>
     */
    public Integer getTerminationWaitTimeInMinutes() {
        return terminationWaitTimeInMinutes;
    }

    /**
     * <p>
     * For an Amazon EC2 deployment, the number of minutes to wait after a
     * successful blue/green deployment before terminating instances from the
     * original environment.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the number of minutes before deleting the
     * original (blue) task set. During an Amazon ECS deployment, CodeDeploy
     * shifts traffic from the original (blue) task set to a replacement (green)
     * task set.
     * </p>
     * <p>
     * The maximum setting is 2880 minutes (2 days).
     * </p>
     *
     * @param terminationWaitTimeInMinutes <p>
     *            For an Amazon EC2 deployment, the number of minutes to wait
     *            after a successful blue/green deployment before terminating
     *            instances from the original environment.
     *            </p>
     *            <p>
     *            For an Amazon ECS deployment, the number of minutes before
     *            deleting the original (blue) task set. During an Amazon ECS
     *            deployment, CodeDeploy shifts traffic from the original (blue)
     *            task set to a replacement (green) task set.
     *            </p>
     *            <p>
     *            The maximum setting is 2880 minutes (2 days).
     *            </p>
     */
    public void setTerminationWaitTimeInMinutes(Integer terminationWaitTimeInMinutes) {
        this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
    }

    /**
     * <p>
     * For an Amazon EC2 deployment, the number of minutes to wait after a
     * successful blue/green deployment before terminating instances from the
     * original environment.
     * </p>
     * <p>
     * For an Amazon ECS deployment, the number of minutes before deleting the
     * original (blue) task set. During an Amazon ECS deployment, CodeDeploy
     * shifts traffic from the original (blue) task set to a replacement (green)
     * task set.
     * </p>
     * <p>
     * The maximum setting is 2880 minutes (2 days).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminationWaitTimeInMinutes <p>
     *            For an Amazon EC2 deployment, the number of minutes to wait
     *            after a successful blue/green deployment before terminating
     *            instances from the original environment.
     *            </p>
     *            <p>
     *            For an Amazon ECS deployment, the number of minutes before
     *            deleting the original (blue) task set. During an Amazon ECS
     *            deployment, CodeDeploy shifts traffic from the original (blue)
     *            task set to a replacement (green) task set.
     *            </p>
     *            <p>
     *            The maximum setting is 2880 minutes (2 days).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlueInstanceTerminationOption withTerminationWaitTimeInMinutes(
            Integer terminationWaitTimeInMinutes) {
        this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
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
        if (getAction() != null)
            sb.append("action: " + getAction() + ",");
        if (getTerminationWaitTimeInMinutes() != null)
            sb.append("terminationWaitTimeInMinutes: " + getTerminationWaitTimeInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminationWaitTimeInMinutes() == null) ? 0
                        : getTerminationWaitTimeInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueInstanceTerminationOption == false)
            return false;
        BlueInstanceTerminationOption other = (BlueInstanceTerminationOption) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getTerminationWaitTimeInMinutes() == null
                ^ this.getTerminationWaitTimeInMinutes() == null)
            return false;
        if (other.getTerminationWaitTimeInMinutes() != null
                && other.getTerminationWaitTimeInMinutes().equals(
                        this.getTerminationWaitTimeInMinutes()) == false)
            return false;
        return true;
    }
}
