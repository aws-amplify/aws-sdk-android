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

public class DeleteLocalGatewayRouteTableVpcAssociationResult implements Serializable {
    /**
     * <p>
     * Information about the association.
     * </p>
     */
    private LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation;

    /**
     * <p>
     * Information about the association.
     * </p>
     *
     * @return <p>
     *         Information about the association.
     *         </p>
     */
    public LocalGatewayRouteTableVpcAssociation getLocalGatewayRouteTableVpcAssociation() {
        return localGatewayRouteTableVpcAssociation;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     *
     * @param localGatewayRouteTableVpcAssociation <p>
     *            Information about the association.
     *            </p>
     */
    public void setLocalGatewayRouteTableVpcAssociation(
            LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation) {
        this.localGatewayRouteTableVpcAssociation = localGatewayRouteTableVpcAssociation;
    }

    /**
     * <p>
     * Information about the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableVpcAssociation <p>
     *            Information about the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteLocalGatewayRouteTableVpcAssociationResult withLocalGatewayRouteTableVpcAssociation(
            LocalGatewayRouteTableVpcAssociation localGatewayRouteTableVpcAssociation) {
        this.localGatewayRouteTableVpcAssociation = localGatewayRouteTableVpcAssociation;
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
        if (getLocalGatewayRouteTableVpcAssociation() != null)
            sb.append("LocalGatewayRouteTableVpcAssociation: "
                    + getLocalGatewayRouteTableVpcAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableVpcAssociation() == null) ? 0
                        : getLocalGatewayRouteTableVpcAssociation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLocalGatewayRouteTableVpcAssociationResult == false)
            return false;
        DeleteLocalGatewayRouteTableVpcAssociationResult other = (DeleteLocalGatewayRouteTableVpcAssociationResult) obj;

        if (other.getLocalGatewayRouteTableVpcAssociation() == null
                ^ this.getLocalGatewayRouteTableVpcAssociation() == null)
            return false;
        if (other.getLocalGatewayRouteTableVpcAssociation() != null
                && other.getLocalGatewayRouteTableVpcAssociation().equals(
                        this.getLocalGatewayRouteTableVpcAssociation()) == false)
            return false;
        return true;
    }
}
