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

public class ReplaceRouteTableAssociationResult implements Serializable {
    /**
     * <p>
     * The ID of the new association.
     * </p>
     */
    private String newAssociationId;

    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private RouteTableAssociationState associationState;

    /**
     * <p>
     * The ID of the new association.
     * </p>
     *
     * @return <p>
     *         The ID of the new association.
     *         </p>
     */
    public String getNewAssociationId() {
        return newAssociationId;
    }

    /**
     * <p>
     * The ID of the new association.
     * </p>
     *
     * @param newAssociationId <p>
     *            The ID of the new association.
     *            </p>
     */
    public void setNewAssociationId(String newAssociationId) {
        this.newAssociationId = newAssociationId;
    }

    /**
     * <p>
     * The ID of the new association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newAssociationId <p>
     *            The ID of the new association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReplaceRouteTableAssociationResult withNewAssociationId(String newAssociationId) {
        this.newAssociationId = newAssociationId;
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
    public ReplaceRouteTableAssociationResult withAssociationState(
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
        if (getNewAssociationId() != null)
            sb.append("NewAssociationId: " + getNewAssociationId() + ",");
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
                + ((getNewAssociationId() == null) ? 0 : getNewAssociationId().hashCode());
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

        if (obj instanceof ReplaceRouteTableAssociationResult == false)
            return false;
        ReplaceRouteTableAssociationResult other = (ReplaceRouteTableAssociationResult) obj;

        if (other.getNewAssociationId() == null ^ this.getNewAssociationId() == null)
            return false;
        if (other.getNewAssociationId() != null
                && other.getNewAssociationId().equals(this.getNewAssociationId()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null
                && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        return true;
    }
}
