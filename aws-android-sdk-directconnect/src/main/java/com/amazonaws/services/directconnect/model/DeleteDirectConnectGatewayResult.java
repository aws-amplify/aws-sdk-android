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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DeleteDirectConnectGatewayResult implements Serializable {
    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     */
    private DirectConnectGateway directConnectGateway;

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The Direct Connect gateway.
     *         </p>
     */
    public DirectConnectGateway getDirectConnectGateway() {
        return directConnectGateway;
    }

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     *
     * @param directConnectGateway <p>
     *            The Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGateway(DirectConnectGateway directConnectGateway) {
        this.directConnectGateway = directConnectGateway;
    }

    /**
     * <p>
     * The Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGateway <p>
     *            The Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDirectConnectGatewayResult withDirectConnectGateway(
            DirectConnectGateway directConnectGateway) {
        this.directConnectGateway = directConnectGateway;
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
        if (getDirectConnectGateway() != null)
            sb.append("directConnectGateway: " + getDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDirectConnectGateway() == null) ? 0 : getDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectConnectGatewayResult == false)
            return false;
        DeleteDirectConnectGatewayResult other = (DeleteDirectConnectGatewayResult) obj;

        if (other.getDirectConnectGateway() == null ^ this.getDirectConnectGateway() == null)
            return false;
        if (other.getDirectConnectGateway() != null
                && other.getDirectConnectGateway().equals(this.getDirectConnectGateway()) == false)
            return false;
        return true;
    }
}
