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

public class DeleteTransitGatewayRouteTableResult implements Serializable {
    /**
     * <p>
     * Information about the deleted transit gateway route table.
     * </p>
     */
    private TransitGatewayRouteTable transitGatewayRouteTable;

    /**
     * <p>
     * Information about the deleted transit gateway route table.
     * </p>
     *
     * @return <p>
     *         Information about the deleted transit gateway route table.
     *         </p>
     */
    public TransitGatewayRouteTable getTransitGatewayRouteTable() {
        return transitGatewayRouteTable;
    }

    /**
     * <p>
     * Information about the deleted transit gateway route table.
     * </p>
     *
     * @param transitGatewayRouteTable <p>
     *            Information about the deleted transit gateway route table.
     *            </p>
     */
    public void setTransitGatewayRouteTable(TransitGatewayRouteTable transitGatewayRouteTable) {
        this.transitGatewayRouteTable = transitGatewayRouteTable;
    }

    /**
     * <p>
     * Information about the deleted transit gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTable <p>
     *            Information about the deleted transit gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTransitGatewayRouteTableResult withTransitGatewayRouteTable(
            TransitGatewayRouteTable transitGatewayRouteTable) {
        this.transitGatewayRouteTable = transitGatewayRouteTable;
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
        if (getTransitGatewayRouteTable() != null)
            sb.append("TransitGatewayRouteTable: " + getTransitGatewayRouteTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayRouteTable() == null) ? 0 : getTransitGatewayRouteTable()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayRouteTableResult == false)
            return false;
        DeleteTransitGatewayRouteTableResult other = (DeleteTransitGatewayRouteTableResult) obj;

        if (other.getTransitGatewayRouteTable() == null
                ^ this.getTransitGatewayRouteTable() == null)
            return false;
        if (other.getTransitGatewayRouteTable() != null
                && other.getTransitGatewayRouteTable().equals(this.getTransitGatewayRouteTable()) == false)
            return false;
        return true;
    }
}
