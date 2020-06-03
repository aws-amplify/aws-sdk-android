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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified attributes of the Direct Connect gateway association.
 * </p>
 * <p>
 * Add or remove prefixes from the association.
 * </p>
 */
public class UpdateDirectConnectGatewayAssociationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     */
    private java.util.List<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway;

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway association.
     *         </p>
     */
    public String getAssociationId() {
        return associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     */
    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationId <p>
     *            The ID of the Direct Connect gateway association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationRequest withAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The Amazon VPC prefixes to advertise to the Direct Connect
     *         gateway.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getAddAllowedPrefixesToDirectConnectGateway() {
        return addAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     */
    public void setAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        if (addAllowedPrefixesToDirectConnectGateway == null) {
            this.addAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.addAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                addAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... addAllowedPrefixesToDirectConnectGateway) {
        if (getAddAllowedPrefixesToDirectConnectGateway() == null) {
            this.addAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    addAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : addAllowedPrefixesToDirectConnectGateway) {
            this.addAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to advertise to the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to advertise to the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationRequest withAddAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> addAllowedPrefixesToDirectConnectGateway) {
        setAddAllowedPrefixesToDirectConnectGateway(addAllowedPrefixesToDirectConnectGateway);
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     *
     * @return <p>
     *         The Amazon VPC prefixes to no longer advertise to the Direct
     *         Connect gateway.
     *         </p>
     */
    public java.util.List<RouteFilterPrefix> getRemoveAllowedPrefixesToDirectConnectGateway() {
        return removeAllowedPrefixesToDirectConnectGateway;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     */
    public void setRemoveAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        if (removeAllowedPrefixesToDirectConnectGateway == null) {
            this.removeAllowedPrefixesToDirectConnectGateway = null;
            return;
        }

        this.removeAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                removeAllowedPrefixesToDirectConnectGateway);
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            RouteFilterPrefix... removeAllowedPrefixesToDirectConnectGateway) {
        if (getRemoveAllowedPrefixesToDirectConnectGateway() == null) {
            this.removeAllowedPrefixesToDirectConnectGateway = new java.util.ArrayList<RouteFilterPrefix>(
                    removeAllowedPrefixesToDirectConnectGateway.length);
        }
        for (RouteFilterPrefix value : removeAllowedPrefixesToDirectConnectGateway) {
            this.removeAllowedPrefixesToDirectConnectGateway.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon VPC prefixes to no longer advertise to the Direct Connect
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeAllowedPrefixesToDirectConnectGateway <p>
     *            The Amazon VPC prefixes to no longer advertise to the Direct
     *            Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDirectConnectGatewayAssociationRequest withRemoveAllowedPrefixesToDirectConnectGateway(
            java.util.Collection<RouteFilterPrefix> removeAllowedPrefixesToDirectConnectGateway) {
        setRemoveAllowedPrefixesToDirectConnectGateway(removeAllowedPrefixesToDirectConnectGateway);
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
            sb.append("associationId: " + getAssociationId() + ",");
        if (getAddAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("addAllowedPrefixesToDirectConnectGateway: "
                    + getAddAllowedPrefixesToDirectConnectGateway() + ",");
        if (getRemoveAllowedPrefixesToDirectConnectGateway() != null)
            sb.append("removeAllowedPrefixesToDirectConnectGateway: "
                    + getRemoveAllowedPrefixesToDirectConnectGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAddAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getAddAllowedPrefixesToDirectConnectGateway().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoveAllowedPrefixesToDirectConnectGateway() == null) ? 0
                        : getRemoveAllowedPrefixesToDirectConnectGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectConnectGatewayAssociationRequest == false)
            return false;
        UpdateDirectConnectGatewayAssociationRequest other = (UpdateDirectConnectGatewayAssociationRequest) obj;

        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null
                && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getAddAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getAddAllowedPrefixesToDirectConnectGateway() != null
                && other.getAddAllowedPrefixesToDirectConnectGateway().equals(
                        this.getAddAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() == null
                ^ this.getRemoveAllowedPrefixesToDirectConnectGateway() == null)
            return false;
        if (other.getRemoveAllowedPrefixesToDirectConnectGateway() != null
                && other.getRemoveAllowedPrefixesToDirectConnectGateway().equals(
                        this.getRemoveAllowedPrefixesToDirectConnectGateway()) == false)
            return false;
        return true;
    }
}
