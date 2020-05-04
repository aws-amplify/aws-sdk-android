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

public class DeleteNatGatewayResult implements Serializable {
    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     */
    private String natGatewayId;

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the NAT gateway.
     *         </p>
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     *
     * @param natGatewayId <p>
     *            The ID of the NAT gateway.
     *            </p>
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    /**
     * <p>
     * The ID of the NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param natGatewayId <p>
     *            The ID of the NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteNatGatewayResult withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
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
        if (getNatGatewayId() != null)
            sb.append("NatGatewayId: " + getNatGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNatGatewayId() == null) ? 0 : getNatGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNatGatewayResult == false)
            return false;
        DeleteNatGatewayResult other = (DeleteNatGatewayResult) obj;

        if (other.getNatGatewayId() == null ^ this.getNatGatewayId() == null)
            return false;
        if (other.getNatGatewayId() != null
                && other.getNatGatewayId().equals(this.getNatGatewayId()) == false)
            return false;
        return true;
    }
}
