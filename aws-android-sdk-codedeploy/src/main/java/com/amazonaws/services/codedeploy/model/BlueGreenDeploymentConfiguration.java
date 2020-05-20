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
 * Information about blue/green deployment options for a deployment group.
 * </p>
 */
public class BlueGreenDeploymentConfiguration implements Serializable {
    /**
     * <p>
     * Information about whether to terminate instances in the original fleet
     * during a blue/green deployment.
     * </p>
     */
    private BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess;

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are
     * ready to receive traffic in a blue/green deployment.
     * </p>
     */
    private DeploymentReadyOption deploymentReadyOption;

    /**
     * <p>
     * Information about how instances are provisioned for a replacement
     * environment in a blue/green deployment.
     * </p>
     */
    private GreenFleetProvisioningOption greenFleetProvisioningOption;

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet
     * during a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         Information about whether to terminate instances in the original
     *         fleet during a blue/green deployment.
     *         </p>
     */
    public BlueInstanceTerminationOption getTerminateBlueInstancesOnDeploymentSuccess() {
        return terminateBlueInstancesOnDeploymentSuccess;
    }

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet
     * during a blue/green deployment.
     * </p>
     *
     * @param terminateBlueInstancesOnDeploymentSuccess <p>
     *            Information about whether to terminate instances in the
     *            original fleet during a blue/green deployment.
     *            </p>
     */
    public void setTerminateBlueInstancesOnDeploymentSuccess(
            BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess) {
        this.terminateBlueInstancesOnDeploymentSuccess = terminateBlueInstancesOnDeploymentSuccess;
    }

    /**
     * <p>
     * Information about whether to terminate instances in the original fleet
     * during a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminateBlueInstancesOnDeploymentSuccess <p>
     *            Information about whether to terminate instances in the
     *            original fleet during a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlueGreenDeploymentConfiguration withTerminateBlueInstancesOnDeploymentSuccess(
            BlueInstanceTerminationOption terminateBlueInstancesOnDeploymentSuccess) {
        this.terminateBlueInstancesOnDeploymentSuccess = terminateBlueInstancesOnDeploymentSuccess;
        return this;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are
     * ready to receive traffic in a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         Information about the action to take when newly provisioned
     *         instances are ready to receive traffic in a blue/green
     *         deployment.
     *         </p>
     */
    public DeploymentReadyOption getDeploymentReadyOption() {
        return deploymentReadyOption;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are
     * ready to receive traffic in a blue/green deployment.
     * </p>
     *
     * @param deploymentReadyOption <p>
     *            Information about the action to take when newly provisioned
     *            instances are ready to receive traffic in a blue/green
     *            deployment.
     *            </p>
     */
    public void setDeploymentReadyOption(DeploymentReadyOption deploymentReadyOption) {
        this.deploymentReadyOption = deploymentReadyOption;
    }

    /**
     * <p>
     * Information about the action to take when newly provisioned instances are
     * ready to receive traffic in a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentReadyOption <p>
     *            Information about the action to take when newly provisioned
     *            instances are ready to receive traffic in a blue/green
     *            deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlueGreenDeploymentConfiguration withDeploymentReadyOption(
            DeploymentReadyOption deploymentReadyOption) {
        this.deploymentReadyOption = deploymentReadyOption;
        return this;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement
     * environment in a blue/green deployment.
     * </p>
     *
     * @return <p>
     *         Information about how instances are provisioned for a replacement
     *         environment in a blue/green deployment.
     *         </p>
     */
    public GreenFleetProvisioningOption getGreenFleetProvisioningOption() {
        return greenFleetProvisioningOption;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement
     * environment in a blue/green deployment.
     * </p>
     *
     * @param greenFleetProvisioningOption <p>
     *            Information about how instances are provisioned for a
     *            replacement environment in a blue/green deployment.
     *            </p>
     */
    public void setGreenFleetProvisioningOption(
            GreenFleetProvisioningOption greenFleetProvisioningOption) {
        this.greenFleetProvisioningOption = greenFleetProvisioningOption;
    }

    /**
     * <p>
     * Information about how instances are provisioned for a replacement
     * environment in a blue/green deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greenFleetProvisioningOption <p>
     *            Information about how instances are provisioned for a
     *            replacement environment in a blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BlueGreenDeploymentConfiguration withGreenFleetProvisioningOption(
            GreenFleetProvisioningOption greenFleetProvisioningOption) {
        this.greenFleetProvisioningOption = greenFleetProvisioningOption;
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
        if (getTerminateBlueInstancesOnDeploymentSuccess() != null)
            sb.append("terminateBlueInstancesOnDeploymentSuccess: "
                    + getTerminateBlueInstancesOnDeploymentSuccess() + ",");
        if (getDeploymentReadyOption() != null)
            sb.append("deploymentReadyOption: " + getDeploymentReadyOption() + ",");
        if (getGreenFleetProvisioningOption() != null)
            sb.append("greenFleetProvisioningOption: " + getGreenFleetProvisioningOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminateBlueInstancesOnDeploymentSuccess() == null) ? 0
                        : getTerminateBlueInstancesOnDeploymentSuccess().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeploymentReadyOption() == null) ? 0 : getDeploymentReadyOption().hashCode());
        hashCode = prime
                * hashCode
                + ((getGreenFleetProvisioningOption() == null) ? 0
                        : getGreenFleetProvisioningOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueGreenDeploymentConfiguration == false)
            return false;
        BlueGreenDeploymentConfiguration other = (BlueGreenDeploymentConfiguration) obj;

        if (other.getTerminateBlueInstancesOnDeploymentSuccess() == null
                ^ this.getTerminateBlueInstancesOnDeploymentSuccess() == null)
            return false;
        if (other.getTerminateBlueInstancesOnDeploymentSuccess() != null
                && other.getTerminateBlueInstancesOnDeploymentSuccess().equals(
                        this.getTerminateBlueInstancesOnDeploymentSuccess()) == false)
            return false;
        if (other.getDeploymentReadyOption() == null ^ this.getDeploymentReadyOption() == null)
            return false;
        if (other.getDeploymentReadyOption() != null
                && other.getDeploymentReadyOption().equals(this.getDeploymentReadyOption()) == false)
            return false;
        if (other.getGreenFleetProvisioningOption() == null
                ^ this.getGreenFleetProvisioningOption() == null)
            return false;
        if (other.getGreenFleetProvisioningOption() != null
                && other.getGreenFleetProvisioningOption().equals(
                        this.getGreenFleetProvisioningOption()) == false)
            return false;
        return true;
    }
}
