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
 * Describes a CIDR block for an address pool.
 * </p>
 */
public class PoolCidrBlock implements Serializable {
    /**
     * <p>
     * The CIDR block.
     * </p>
     */
    private String cidr;

    /**
     * <p>
     * The CIDR block.
     * </p>
     *
     * @return <p>
     *         The CIDR block.
     *         </p>
     */
    public String getCidr() {
        return cidr;
    }

    /**
     * <p>
     * The CIDR block.
     * </p>
     *
     * @param cidr <p>
     *            The CIDR block.
     *            </p>
     */
    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidr <p>
     *            The CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PoolCidrBlock withCidr(String cidr) {
        this.cidr = cidr;
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
        if (getCidr() != null)
            sb.append("Cidr: " + getCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PoolCidrBlock == false)
            return false;
        PoolCidrBlock other = (PoolCidrBlock) obj;

        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        return true;
    }
}
