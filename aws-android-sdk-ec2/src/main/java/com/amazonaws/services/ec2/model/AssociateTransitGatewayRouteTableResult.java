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

public class AssociateTransitGatewayRouteTableResult implements Serializable {
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private TransitGatewayAssociation association;

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public TransitGatewayAssociation getAssociation() {
        return association;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param association <p>
     *            The ID of the association.
     *            </p>
     */
    public void setAssociation(TransitGatewayAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param association <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateTransitGatewayRouteTableResult withAssociation(
            TransitGatewayAssociation association) {
        this.association = association;
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
        if (getAssociation() != null)
            sb.append("Association: " + getAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateTransitGatewayRouteTableResult == false)
            return false;
        AssociateTransitGatewayRouteTableResult other = (AssociateTransitGatewayRouteTableResult) obj;

        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null
                && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        return true;
    }
}
