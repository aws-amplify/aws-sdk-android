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
 * Information about the instances that belong to the replacement environment in
 * a blue/green deployment.
 * </p>
 */
public class GreenFleetProvisioningOption implements Serializable {
    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     */
    private String action;

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     *
     * @return <p>
     *         The method used to add instances to a replacement environment.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DISCOVER_EXISTING</code>: Use instances that already exist
     *         or will be created manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a
     *         specified Auto Scaling group to define and create instances in a
     *         new Auto Scaling group.
     *         </p>
     *         </li>
     *         </ul>
     * @see GreenFleetProvisioningAction
     */
    public String getAction() {
        return action;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     *
     * @param action <p>
     *            The method used to add instances to a replacement environment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISCOVER_EXISTING</code>: Use instances that already
     *            exist or will be created manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a
     *            specified Auto Scaling group to define and create instances in
     *            a new Auto Scaling group.
     *            </p>
     *            </li>
     *            </ul>
     * @see GreenFleetProvisioningAction
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     *
     * @param action <p>
     *            The method used to add instances to a replacement environment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISCOVER_EXISTING</code>: Use instances that already
     *            exist or will be created manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a
     *            specified Auto Scaling group to define and create instances in
     *            a new Auto Scaling group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GreenFleetProvisioningAction
     */
    public GreenFleetProvisioningOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     *
     * @param action <p>
     *            The method used to add instances to a replacement environment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISCOVER_EXISTING</code>: Use instances that already
     *            exist or will be created manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a
     *            specified Auto Scaling group to define and create instances in
     *            a new Auto Scaling group.
     *            </p>
     *            </li>
     *            </ul>
     * @see GreenFleetProvisioningAction
     */
    public void setAction(GreenFleetProvisioningAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The method used to add instances to a replacement environment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DISCOVER_EXISTING</code>: Use instances that already exist or will
     * be created manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a specified Auto
     * Scaling group to define and create instances in a new Auto Scaling group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISCOVER_EXISTING, COPY_AUTO_SCALING_GROUP
     *
     * @param action <p>
     *            The method used to add instances to a replacement environment.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DISCOVER_EXISTING</code>: Use instances that already
     *            exist or will be created manually.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>COPY_AUTO_SCALING_GROUP</code>: Use settings from a
     *            specified Auto Scaling group to define and create instances in
     *            a new Auto Scaling group.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GreenFleetProvisioningAction
     */
    public GreenFleetProvisioningOption withAction(GreenFleetProvisioningAction action) {
        this.action = action.toString();
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
            sb.append("action: " + getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GreenFleetProvisioningOption == false)
            return false;
        GreenFleetProvisioningOption other = (GreenFleetProvisioningOption) obj;

        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }
}
