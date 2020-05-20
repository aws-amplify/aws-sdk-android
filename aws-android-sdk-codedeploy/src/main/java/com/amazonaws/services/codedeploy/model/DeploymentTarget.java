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
 * Information about the deployment target.
 * </p>
 */
public class DeploymentTarget implements Serializable {
    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     */
    private String deploymentTargetType;

    /**
     * <p>
     * Information about the target for a deployment that uses the
     * EC2/On-premises compute platform.
     * </p>
     */
    private InstanceTarget instanceTarget;

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda
     * compute platform.
     * </p>
     */
    private LambdaTarget lambdaTarget;

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS
     * compute platform.
     * </p>
     */
    private ECSTarget ecsTarget;

    /**
     * <p>
     * Information about the target to be updated by an AWS CloudFormation
     * blue/green deployment. This target type is used for all deployments
     * initiated by a CloudFormation stack update.
     * </p>
     */
    private CloudFormationTarget cloudFormationTarget;

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     *
     * @return <p>
     *         The deployment type that is specific to the deployment's compute
     *         platform or deployments initiated by a CloudFormation stack
     *         update.
     *         </p>
     * @see DeploymentTargetType
     */
    public String getDeploymentTargetType() {
        return deploymentTargetType;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     *
     * @param deploymentTargetType <p>
     *            The deployment type that is specific to the deployment's
     *            compute platform or deployments initiated by a CloudFormation
     *            stack update.
     *            </p>
     * @see DeploymentTargetType
     */
    public void setDeploymentTargetType(String deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     *
     * @param deploymentTargetType <p>
     *            The deployment type that is specific to the deployment's
     *            compute platform or deployments initiated by a CloudFormation
     *            stack update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentTargetType
     */
    public DeploymentTarget withDeploymentTargetType(String deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType;
        return this;
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     *
     * @param deploymentTargetType <p>
     *            The deployment type that is specific to the deployment's
     *            compute platform or deployments initiated by a CloudFormation
     *            stack update.
     *            </p>
     * @see DeploymentTargetType
     */
    public void setDeploymentTargetType(DeploymentTargetType deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType.toString();
    }

    /**
     * <p>
     * The deployment type that is specific to the deployment's compute platform
     * or deployments initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceTarget, LambdaTarget, ECSTarget,
     * CloudFormationTarget
     *
     * @param deploymentTargetType <p>
     *            The deployment type that is specific to the deployment's
     *            compute platform or deployments initiated by a CloudFormation
     *            stack update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentTargetType
     */
    public DeploymentTarget withDeploymentTargetType(DeploymentTargetType deploymentTargetType) {
        this.deploymentTargetType = deploymentTargetType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the
     * EC2/On-premises compute platform.
     * </p>
     *
     * @return <p>
     *         Information about the target for a deployment that uses the
     *         EC2/On-premises compute platform.
     *         </p>
     */
    public InstanceTarget getInstanceTarget() {
        return instanceTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the
     * EC2/On-premises compute platform.
     * </p>
     *
     * @param instanceTarget <p>
     *            Information about the target for a deployment that uses the
     *            EC2/On-premises compute platform.
     *            </p>
     */
    public void setInstanceTarget(InstanceTarget instanceTarget) {
        this.instanceTarget = instanceTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the
     * EC2/On-premises compute platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceTarget <p>
     *            Information about the target for a deployment that uses the
     *            EC2/On-premises compute platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTarget withInstanceTarget(InstanceTarget instanceTarget) {
        this.instanceTarget = instanceTarget;
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda
     * compute platform.
     * </p>
     *
     * @return <p>
     *         Information about the target for a deployment that uses the AWS
     *         Lambda compute platform.
     *         </p>
     */
    public LambdaTarget getLambdaTarget() {
        return lambdaTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda
     * compute platform.
     * </p>
     *
     * @param lambdaTarget <p>
     *            Information about the target for a deployment that uses the
     *            AWS Lambda compute platform.
     *            </p>
     */
    public void setLambdaTarget(LambdaTarget lambdaTarget) {
        this.lambdaTarget = lambdaTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the AWS Lambda
     * compute platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaTarget <p>
     *            Information about the target for a deployment that uses the
     *            AWS Lambda compute platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTarget withLambdaTarget(LambdaTarget lambdaTarget) {
        this.lambdaTarget = lambdaTarget;
        return this;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS
     * compute platform.
     * </p>
     *
     * @return <p>
     *         Information about the target for a deployment that uses the
     *         Amazon ECS compute platform.
     *         </p>
     */
    public ECSTarget getEcsTarget() {
        return ecsTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS
     * compute platform.
     * </p>
     *
     * @param ecsTarget <p>
     *            Information about the target for a deployment that uses the
     *            Amazon ECS compute platform.
     *            </p>
     */
    public void setEcsTarget(ECSTarget ecsTarget) {
        this.ecsTarget = ecsTarget;
    }

    /**
     * <p>
     * Information about the target for a deployment that uses the Amazon ECS
     * compute platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ecsTarget <p>
     *            Information about the target for a deployment that uses the
     *            Amazon ECS compute platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTarget withEcsTarget(ECSTarget ecsTarget) {
        this.ecsTarget = ecsTarget;
        return this;
    }

    /**
     * <p>
     * Information about the target to be updated by an AWS CloudFormation
     * blue/green deployment. This target type is used for all deployments
     * initiated by a CloudFormation stack update.
     * </p>
     *
     * @return <p>
     *         Information about the target to be updated by an AWS
     *         CloudFormation blue/green deployment. This target type is used
     *         for all deployments initiated by a CloudFormation stack update.
     *         </p>
     */
    public CloudFormationTarget getCloudFormationTarget() {
        return cloudFormationTarget;
    }

    /**
     * <p>
     * Information about the target to be updated by an AWS CloudFormation
     * blue/green deployment. This target type is used for all deployments
     * initiated by a CloudFormation stack update.
     * </p>
     *
     * @param cloudFormationTarget <p>
     *            Information about the target to be updated by an AWS
     *            CloudFormation blue/green deployment. This target type is used
     *            for all deployments initiated by a CloudFormation stack
     *            update.
     *            </p>
     */
    public void setCloudFormationTarget(CloudFormationTarget cloudFormationTarget) {
        this.cloudFormationTarget = cloudFormationTarget;
    }

    /**
     * <p>
     * Information about the target to be updated by an AWS CloudFormation
     * blue/green deployment. This target type is used for all deployments
     * initiated by a CloudFormation stack update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudFormationTarget <p>
     *            Information about the target to be updated by an AWS
     *            CloudFormation blue/green deployment. This target type is used
     *            for all deployments initiated by a CloudFormation stack
     *            update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTarget withCloudFormationTarget(CloudFormationTarget cloudFormationTarget) {
        this.cloudFormationTarget = cloudFormationTarget;
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
        if (getDeploymentTargetType() != null)
            sb.append("deploymentTargetType: " + getDeploymentTargetType() + ",");
        if (getInstanceTarget() != null)
            sb.append("instanceTarget: " + getInstanceTarget() + ",");
        if (getLambdaTarget() != null)
            sb.append("lambdaTarget: " + getLambdaTarget() + ",");
        if (getEcsTarget() != null)
            sb.append("ecsTarget: " + getEcsTarget() + ",");
        if (getCloudFormationTarget() != null)
            sb.append("cloudFormationTarget: " + getCloudFormationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentTargetType() == null) ? 0 : getDeploymentTargetType().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceTarget() == null) ? 0 : getInstanceTarget().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaTarget() == null) ? 0 : getLambdaTarget().hashCode());
        hashCode = prime * hashCode + ((getEcsTarget() == null) ? 0 : getEcsTarget().hashCode());
        hashCode = prime * hashCode
                + ((getCloudFormationTarget() == null) ? 0 : getCloudFormationTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentTarget == false)
            return false;
        DeploymentTarget other = (DeploymentTarget) obj;

        if (other.getDeploymentTargetType() == null ^ this.getDeploymentTargetType() == null)
            return false;
        if (other.getDeploymentTargetType() != null
                && other.getDeploymentTargetType().equals(this.getDeploymentTargetType()) == false)
            return false;
        if (other.getInstanceTarget() == null ^ this.getInstanceTarget() == null)
            return false;
        if (other.getInstanceTarget() != null
                && other.getInstanceTarget().equals(this.getInstanceTarget()) == false)
            return false;
        if (other.getLambdaTarget() == null ^ this.getLambdaTarget() == null)
            return false;
        if (other.getLambdaTarget() != null
                && other.getLambdaTarget().equals(this.getLambdaTarget()) == false)
            return false;
        if (other.getEcsTarget() == null ^ this.getEcsTarget() == null)
            return false;
        if (other.getEcsTarget() != null
                && other.getEcsTarget().equals(this.getEcsTarget()) == false)
            return false;
        if (other.getCloudFormationTarget() == null ^ this.getCloudFormationTarget() == null)
            return false;
        if (other.getCloudFormationTarget() != null
                && other.getCloudFormationTarget().equals(this.getCloudFormationTarget()) == false)
            return false;
        return true;
    }
}
