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

/**
 * <p>
 * Information about the number of instances that can be launched onto the
 * Dedicated Host.
 * </p>
 */
public class InstanceCapacity implements Serializable {
    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * based on the host's available capacity.
     * </p>
     */
    private Integer availableCapacity;

    /**
     * <p>
     * The instance type supported by the Dedicated Host.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated
     * Host if there are no instances running on it.
     * </p>
     */
    private Integer totalCapacity;

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * based on the host's available capacity.
     * </p>
     *
     * @return <p>
     *         The number of instances that can be launched onto the Dedicated
     *         Host based on the host's available capacity.
     *         </p>
     */
    public Integer getAvailableCapacity() {
        return availableCapacity;
    }

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * based on the host's available capacity.
     * </p>
     *
     * @param availableCapacity <p>
     *            The number of instances that can be launched onto the
     *            Dedicated Host based on the host's available capacity.
     *            </p>
     */
    public void setAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    /**
     * <p>
     * The number of instances that can be launched onto the Dedicated Host
     * based on the host's available capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableCapacity <p>
     *            The number of instances that can be launched onto the
     *            Dedicated Host based on the host's available capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceCapacity withAvailableCapacity(Integer availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host.
     * </p>
     *
     * @return <p>
     *         The instance type supported by the Dedicated Host.
     *         </p>
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host.
     * </p>
     *
     * @param instanceType <p>
     *            The instance type supported by the Dedicated Host.
     *            </p>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type supported by the Dedicated Host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceType <p>
     *            The instance type supported by the Dedicated Host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceCapacity withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated
     * Host if there are no instances running on it.
     * </p>
     *
     * @return <p>
     *         The total number of instances that can be launched onto the
     *         Dedicated Host if there are no instances running on it.
     *         </p>
     */
    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated
     * Host if there are no instances running on it.
     * </p>
     *
     * @param totalCapacity <p>
     *            The total number of instances that can be launched onto the
     *            Dedicated Host if there are no instances running on it.
     *            </p>
     */
    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    /**
     * <p>
     * The total number of instances that can be launched onto the Dedicated
     * Host if there are no instances running on it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalCapacity <p>
     *            The total number of instances that can be launched onto the
     *            Dedicated Host if there are no instances running on it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceCapacity withTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
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
        if (getAvailableCapacity() != null)
            sb.append("AvailableCapacity: " + getAvailableCapacity() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getTotalCapacity() != null)
            sb.append("TotalCapacity: " + getTotalCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailableCapacity() == null) ? 0 : getAvailableCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode
                + ((getTotalCapacity() == null) ? 0 : getTotalCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceCapacity == false)
            return false;
        InstanceCapacity other = (InstanceCapacity) obj;

        if (other.getAvailableCapacity() == null ^ this.getAvailableCapacity() == null)
            return false;
        if (other.getAvailableCapacity() != null
                && other.getAvailableCapacity().equals(this.getAvailableCapacity()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getTotalCapacity() == null ^ this.getTotalCapacity() == null)
            return false;
        if (other.getTotalCapacity() != null
                && other.getTotalCapacity().equals(this.getTotalCapacity()) == false)
            return false;
        return true;
    }
}
