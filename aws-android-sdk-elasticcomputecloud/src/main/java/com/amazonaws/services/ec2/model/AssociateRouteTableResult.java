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

public class AssociateRouteTableResult implements Serializable {
    /**
     * <p>
     * The route table association ID. This ID is required for disassociating
     * the route table.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private RouteTableAssociationState associationState;

    /**
     * <p>
     * The route table association ID. This ID is required for disassociating
     * the route table.
     * </p>
     *
     * @return <p>
     *         The route table association ID. This ID is required for
     *         disassociating the route table.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The route table association ID. This ID is required for disassociating
     * the route table.
     * </p>
     *
     * @param associationId <p>
     *            The route table association ID. This ID is required for
     *            disassociating the route table.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The route table association ID. This ID is required for disassociating
     * the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The route table association ID. This ID is required for
     *            disassociating the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateRouteTableResult withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     *
     * @return <p>
     *         The state of the association.
     *         </p>
     */
    public RouteTableAssociationState getAssociationState() {
        return associationState;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     *
     * @param associationState <p>
     *            The state of the association.
     *            </p>
     */
    public void setAssociationState(RouteTableAssociationState associationState) {
        this.associationState = associationState;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationState <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateRouteTableResult withAssociationState(
            RouteTableAssociationState associationState) {
        this.associationState = associationState;
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
        if (getAssociationId() != null)
            sb.append("AssociationId: " + getAssociationId() + ",");
        if (getAssociationState() != null)
            sb.append("AssociationState: " + getAssociationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode
                + ((getAssociationState() == null) ? 0 : getAssociationState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateRouteTableResult == false)
            return false;
        AssociateRouteTableResult other = (AssociateRouteTableResult) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null
                && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        return true;
    }
}
