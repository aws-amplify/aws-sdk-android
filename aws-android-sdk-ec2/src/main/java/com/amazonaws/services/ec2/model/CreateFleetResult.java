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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class CreateFleetResult implements Serializable {
    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     */
    private java.util.List<CreateFleetError> errors;

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     */
    private java.util.List<CreateFleetInstance> instances;

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The ID of the EC2 Fleet.
     *         </p>
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     */
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetResult withFleetId(String fleetId) {
        this.fleetId = fleetId;
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Information about the instances that could not be launched by the
     *         fleet. Valid only when <b>Type</b> is set to <code>instant</code>
     *         .
     *         </p>
     */
    public java.util.List<CreateFleetError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     */
    public void setErrors(java.util.Collection<CreateFleetError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<CreateFleetError>(errors);
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetResult withErrors(CreateFleetError... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<CreateFleetError>(errors.length);
        }
        for (CreateFleetError value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that could not be launched by the fleet.
     * Valid only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Information about the instances that could not be launched by
     *            the fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetResult withErrors(java.util.Collection<CreateFleetError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Information about the instances that were launched by the fleet.
     *         Valid only when <b>Type</b> is set to <code>instant</code>.
     *         </p>
     */
    public java.util.List<CreateFleetInstance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     */
    public void setInstances(java.util.Collection<CreateFleetInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<CreateFleetInstance>(instances);
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetResult withInstances(CreateFleetInstance... instances) {
        if (getInstances() == null) {
            this.instances = new java.util.ArrayList<CreateFleetInstance>(instances.length);
        }
        for (CreateFleetInstance value : instances) {
            this.instances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the instances that were launched by the fleet. Valid
     * only when <b>Type</b> is set to <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instances <p>
     *            Information about the instances that were launched by the
     *            fleet. Valid only when <b>Type</b> is set to
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFleetResult withInstances(java.util.Collection<CreateFleetInstance> instances) {
        setInstances(instances);
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
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors() + ",");
        if (getInstances() != null)
            sb.append("Instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetResult == false)
            return false;
        CreateFleetResult other = (CreateFleetResult) obj;

        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }
}
