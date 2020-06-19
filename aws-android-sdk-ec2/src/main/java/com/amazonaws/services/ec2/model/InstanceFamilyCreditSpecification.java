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
 * Describes the default credit option for CPU usage of a burstable performance
 * instance family.
 * </p>
 */
public class InstanceFamilyCreditSpecification implements Serializable {
    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     */
    private String instanceFamily;

    /**
     * <p>
     * The default credit option for CPU usage of the instance family. Valid
     * values are <code>standard</code> and <code>unlimited</code>.
     * </p>
     */
    private String cpuCredits;

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @return <p>
     *         The instance family.
     *         </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnlimitedSupportedInstanceFamily
     */
    public InstanceFamilyCreditSpecification withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public void setInstanceFamily(UnlimitedSupportedInstanceFamily instanceFamily) {
        this.instanceFamily = instanceFamily.toString();
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnlimitedSupportedInstanceFamily
     */
    public InstanceFamilyCreditSpecification withInstanceFamily(
            UnlimitedSupportedInstanceFamily instanceFamily) {
        this.instanceFamily = instanceFamily.toString();
        return this;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family. Valid
     * values are <code>standard</code> and <code>unlimited</code>.
     * </p>
     *
     * @return <p>
     *         The default credit option for CPU usage of the instance family.
     *         Valid values are <code>standard</code> and <code>unlimited</code>
     *         .
     *         </p>
     */
    public String getCpuCredits() {
        return cpuCredits;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family. Valid
     * values are <code>standard</code> and <code>unlimited</code>.
     * </p>
     *
     * @param cpuCredits <p>
     *            The default credit option for CPU usage of the instance
     *            family. Valid values are <code>standard</code> and
     *            <code>unlimited</code>.
     *            </p>
     */
    public void setCpuCredits(String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family. Valid
     * values are <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCredits <p>
     *            The default credit option for CPU usage of the instance
     *            family. Valid values are <code>standard</code> and
     *            <code>unlimited</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFamilyCreditSpecification withCpuCredits(String cpuCredits) {
        this.cpuCredits = cpuCredits;
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
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getCpuCredits() != null)
            sb.append("CpuCredits: " + getCpuCredits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getCpuCredits() == null) ? 0 : getCpuCredits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFamilyCreditSpecification == false)
            return false;
        InstanceFamilyCreditSpecification other = (InstanceFamilyCreditSpecification) obj;

        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getCpuCredits() == null ^ this.getCpuCredits() == null)
            return false;
        if (other.getCpuCredits() != null
                && other.getCpuCredits().equals(this.getCpuCredits()) == false)
            return false;
        return true;
    }
}
