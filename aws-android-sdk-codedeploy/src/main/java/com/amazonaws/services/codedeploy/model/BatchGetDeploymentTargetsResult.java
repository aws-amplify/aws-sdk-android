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

public class BatchGetDeploymentTargetsResult implements Serializable {
    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains
     * details about the target, such as its status and lifecycle events. The
     * type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: The target object is an AWS CloudFormation
     * blue/green deployment.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<DeploymentTarget> deploymentTargets;

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains
     * details about the target, such as its status and lifecycle events. The
     * type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: The target object is an AWS CloudFormation
     * blue/green deployment.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of target objects for a deployment. Each target object
     *         contains details about the target, such as its status and
     *         lifecycle events. The type of the target objects depends on the
     *         deployment' compute platform.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>EC2/On-premises</b>: Each target object is an EC2 or
     *         on-premises instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS Lambda</b>: The target object is a specific version of an
     *         AWS Lambda function.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CloudFormation</b>: The target object is an AWS CloudFormation
     *         blue/green deployment.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        return deploymentTargets;
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains
     * details about the target, such as its status and lifecycle events. The
     * type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: The target object is an AWS CloudFormation
     * blue/green deployment.
     * </p>
     * </li>
     * </ul>
     *
     * @param deploymentTargets <p>
     *            A list of target objects for a deployment. Each target object
     *            contains details about the target, such as its status and
     *            lifecycle events. The type of the target objects depends on
     *            the deployment' compute platform.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>EC2/On-premises</b>: Each target object is an EC2 or
     *            on-premises instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AWS Lambda</b>: The target object is a specific version of
     *            an AWS Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFormation</b>: The target object is an AWS
     *            CloudFormation blue/green deployment.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDeploymentTargets(java.util.Collection<DeploymentTarget> deploymentTargets) {
        if (deploymentTargets == null) {
            this.deploymentTargets = null;
            return;
        }

        this.deploymentTargets = new java.util.ArrayList<DeploymentTarget>(deploymentTargets);
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains
     * details about the target, such as its status and lifecycle events. The
     * type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: The target object is an AWS CloudFormation
     * blue/green deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTargets <p>
     *            A list of target objects for a deployment. Each target object
     *            contains details about the target, such as its status and
     *            lifecycle events. The type of the target objects depends on
     *            the deployment' compute platform.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>EC2/On-premises</b>: Each target object is an EC2 or
     *            on-premises instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AWS Lambda</b>: The target object is a specific version of
     *            an AWS Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFormation</b>: The target object is an AWS
     *            CloudFormation blue/green deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentTargetsResult withDeploymentTargets(
            DeploymentTarget... deploymentTargets) {
        if (getDeploymentTargets() == null) {
            this.deploymentTargets = new java.util.ArrayList<DeploymentTarget>(
                    deploymentTargets.length);
        }
        for (DeploymentTarget value : deploymentTargets) {
            this.deploymentTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of target objects for a deployment. Each target object contains
     * details about the target, such as its status and lifecycle events. The
     * type of the target objects depends on the deployment' compute platform.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>EC2/On-premises</b>: Each target object is an EC2 or on-premises
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Lambda</b>: The target object is a specific version of an AWS
     * Lambda function.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFormation</b>: The target object is an AWS CloudFormation
     * blue/green deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTargets <p>
     *            A list of target objects for a deployment. Each target object
     *            contains details about the target, such as its status and
     *            lifecycle events. The type of the target objects depends on
     *            the deployment' compute platform.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>EC2/On-premises</b>: Each target object is an EC2 or
     *            on-premises instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>AWS Lambda</b>: The target object is a specific version of
     *            an AWS Lambda function.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>Amazon ECS</b>: The target object is an Amazon ECS service.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>CloudFormation</b>: The target object is an AWS
     *            CloudFormation blue/green deployment.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetDeploymentTargetsResult withDeploymentTargets(
            java.util.Collection<DeploymentTarget> deploymentTargets) {
        setDeploymentTargets(deploymentTargets);
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
        if (getDeploymentTargets() != null)
            sb.append("deploymentTargets: " + getDeploymentTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentTargetsResult == false)
            return false;
        BatchGetDeploymentTargetsResult other = (BatchGetDeploymentTargetsResult) obj;

        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null
                && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        return true;
    }
}
