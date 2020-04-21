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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Resource utilization of current resource.
 * </p>
 */
public class ResourceUtilization implements Serializable {
    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     */
    private EC2ResourceUtilization eC2ResourceUtilization;

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     *
     * @return <p>
     *         Utilization of current Amazon EC2 Instance
     *         </p>
     */
    public EC2ResourceUtilization getEC2ResourceUtilization() {
        return eC2ResourceUtilization;
    }

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     *
     * @param eC2ResourceUtilization <p>
     *            Utilization of current Amazon EC2 Instance
     *            </p>
     */
    public void setEC2ResourceUtilization(EC2ResourceUtilization eC2ResourceUtilization) {
        this.eC2ResourceUtilization = eC2ResourceUtilization;
    }

    /**
     * <p>
     * Utilization of current Amazon EC2 Instance
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eC2ResourceUtilization <p>
     *            Utilization of current Amazon EC2 Instance
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceUtilization withEC2ResourceUtilization(
            EC2ResourceUtilization eC2ResourceUtilization) {
        this.eC2ResourceUtilization = eC2ResourceUtilization;
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
        if (getEC2ResourceUtilization() != null)
            sb.append("EC2ResourceUtilization: " + getEC2ResourceUtilization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEC2ResourceUtilization() == null) ? 0 : getEC2ResourceUtilization()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceUtilization == false)
            return false;
        ResourceUtilization other = (ResourceUtilization) obj;

        if (other.getEC2ResourceUtilization() == null ^ this.getEC2ResourceUtilization() == null)
            return false;
        if (other.getEC2ResourceUtilization() != null
                && other.getEC2ResourceUtilization().equals(this.getEC2ResourceUtilization()) == false)
            return false;
        return true;
    }
}
