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
 * Describes an IPv4 CIDR block.
 * </p>
 */
public class CidrBlock implements Serializable {
    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     */
    private String cidrBlock;

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     *
     * @return <p>
     *         The IPv4 CIDR block.
     *         </p>
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block.
     *            </p>
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPv4 CIDR block.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrBlock <p>
     *            The IPv4 CIDR block.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CidrBlock withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
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
        if (getCidrBlock() != null)
            sb.append("CidrBlock: " + getCidrBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CidrBlock == false)
            return false;
        CidrBlock other = (CidrBlock) obj;

        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null
                && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        return true;
    }
}
