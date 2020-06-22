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

public class GetDefaultCreditSpecificationResult implements Serializable {
    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     */
    private InstanceFamilyCreditSpecification instanceFamilyCreditSpecification;

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     *
     * @return <p>
     *         The default credit option for CPU usage of the instance family.
     *         </p>
     */
    public InstanceFamilyCreditSpecification getInstanceFamilyCreditSpecification() {
        return instanceFamilyCreditSpecification;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     *
     * @param instanceFamilyCreditSpecification <p>
     *            The default credit option for CPU usage of the instance
     *            family.
     *            </p>
     */
    public void setInstanceFamilyCreditSpecification(
            InstanceFamilyCreditSpecification instanceFamilyCreditSpecification) {
        this.instanceFamilyCreditSpecification = instanceFamilyCreditSpecification;
    }

    /**
     * <p>
     * The default credit option for CPU usage of the instance family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamilyCreditSpecification <p>
     *            The default credit option for CPU usage of the instance
     *            family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDefaultCreditSpecificationResult withInstanceFamilyCreditSpecification(
            InstanceFamilyCreditSpecification instanceFamilyCreditSpecification) {
        this.instanceFamilyCreditSpecification = instanceFamilyCreditSpecification;
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
        if (getInstanceFamilyCreditSpecification() != null)
            sb.append("InstanceFamilyCreditSpecification: "
                    + getInstanceFamilyCreditSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceFamilyCreditSpecification() == null) ? 0
                        : getInstanceFamilyCreditSpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultCreditSpecificationResult == false)
            return false;
        GetDefaultCreditSpecificationResult other = (GetDefaultCreditSpecificationResult) obj;

        if (other.getInstanceFamilyCreditSpecification() == null
                ^ this.getInstanceFamilyCreditSpecification() == null)
            return false;
        if (other.getInstanceFamilyCreditSpecification() != null
                && other.getInstanceFamilyCreditSpecification().equals(
                        this.getInstanceFamilyCreditSpecification()) == false)
            return false;
        return true;
    }
}
