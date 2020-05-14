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
 * The credit option for CPU usage of a T2 or T3 instance.
 * </p>
 */
public class CreditSpecificationRequest implements Serializable {
    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     */
    private String cpuCredits;

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     *
     * @return <p>
     *         The credit option for CPU usage of a T2 or T3 instance. Valid
     *         values are <code>standard</code> and <code>unlimited</code>.
     *         </p>
     */
    public String getCpuCredits() {
        return cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     *
     * @param cpuCredits <p>
     *            The credit option for CPU usage of a T2 or T3 instance. Valid
     *            values are <code>standard</code> and <code>unlimited</code>.
     *            </p>
     */
    public void setCpuCredits(String cpuCredits) {
        this.cpuCredits = cpuCredits;
    }

    /**
     * <p>
     * The credit option for CPU usage of a T2 or T3 instance. Valid values are
     * <code>standard</code> and <code>unlimited</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cpuCredits <p>
     *            The credit option for CPU usage of a T2 or T3 instance. Valid
     *            values are <code>standard</code> and <code>unlimited</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreditSpecificationRequest withCpuCredits(String cpuCredits) {
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
        if (getCpuCredits() != null)
            sb.append("CpuCredits: " + getCpuCredits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuCredits() == null) ? 0 : getCpuCredits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreditSpecificationRequest == false)
            return false;
        CreditSpecificationRequest other = (CreditSpecificationRequest) obj;

        if (other.getCpuCredits() == null ^ this.getCpuCredits() == null)
            return false;
        if (other.getCpuCredits() != null
                && other.getCpuCredits().equals(this.getCpuCredits()) == false)
            return false;
        return true;
    }
}
