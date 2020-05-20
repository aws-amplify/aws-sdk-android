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
 * Information about the type of deployment, either in-place or blue/green, you
 * want to run and whether to route deployment traffic behind a load balancer.
 * </p>
 */
public class DeploymentStyle implements Serializable {
    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     */
    private String deploymentType;

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     */
    private String deploymentOption;

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     *
     * @return <p>
     *         Indicates whether to run an in-place deployment or a blue/green
     *         deployment.
     *         </p>
     * @see DeploymentType
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     *
     * @param deploymentType <p>
     *            Indicates whether to run an in-place deployment or a
     *            blue/green deployment.
     *            </p>
     * @see DeploymentType
     */
    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     *
     * @param deploymentType <p>
     *            Indicates whether to run an in-place deployment or a
     *            blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentType
     */
    public DeploymentStyle withDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     *
     * @param deploymentType <p>
     *            Indicates whether to run an in-place deployment or a
     *            blue/green deployment.
     *            </p>
     * @see DeploymentType
     */
    public void setDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
    }

    /**
     * <p>
     * Indicates whether to run an in-place deployment or a blue/green
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PLACE, BLUE_GREEN
     *
     * @param deploymentType <p>
     *            Indicates whether to run an in-place deployment or a
     *            blue/green deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentType
     */
    public DeploymentStyle withDeploymentType(DeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     *
     * @return <p>
     *         Indicates whether to route deployment traffic behind a load
     *         balancer.
     *         </p>
     * @see DeploymentOption
     */
    public String getDeploymentOption() {
        return deploymentOption;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     *
     * @param deploymentOption <p>
     *            Indicates whether to route deployment traffic behind a load
     *            balancer.
     *            </p>
     * @see DeploymentOption
     */
    public void setDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     *
     * @param deploymentOption <p>
     *            Indicates whether to route deployment traffic behind a load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentOption
     */
    public DeploymentStyle withDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
        return this;
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     *
     * @param deploymentOption <p>
     *            Indicates whether to route deployment traffic behind a load
     *            balancer.
     *            </p>
     * @see DeploymentOption
     */
    public void setDeploymentOption(DeploymentOption deploymentOption) {
        this.deploymentOption = deploymentOption.toString();
    }

    /**
     * <p>
     * Indicates whether to route deployment traffic behind a load balancer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WITH_TRAFFIC_CONTROL, WITHOUT_TRAFFIC_CONTROL
     *
     * @param deploymentOption <p>
     *            Indicates whether to route deployment traffic behind a load
     *            balancer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeploymentOption
     */
    public DeploymentStyle withDeploymentOption(DeploymentOption deploymentOption) {
        this.deploymentOption = deploymentOption.toString();
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
        if (getDeploymentType() != null)
            sb.append("deploymentType: " + getDeploymentType() + ",");
        if (getDeploymentOption() != null)
            sb.append("deploymentOption: " + getDeploymentOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentOption() == null) ? 0 : getDeploymentOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentStyle == false)
            return false;
        DeploymentStyle other = (DeploymentStyle) obj;

        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null
                && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getDeploymentOption() == null ^ this.getDeploymentOption() == null)
            return false;
        if (other.getDeploymentOption() != null
                && other.getDeploymentOption().equals(this.getDeploymentOption()) == false)
            return false;
        return true;
    }
}
