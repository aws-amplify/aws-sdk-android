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
 * Describes an association between a route table and a subnet or gateway.
 * </p>
 */
public class RouteTableAssociation implements Serializable {
    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     */
    private Boolean main;

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String routeTableAssociationId;

    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit
     * association.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The ID of the internet gateway or virtual private gateway.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private RouteTableAssociationState associationState;

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the main route table.
     *         </p>
     */
    public Boolean isMain() {
        return main;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the main route table.
     *         </p>
     */
    public Boolean getMain() {
        return main;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     *
     * @param main <p>
     *            Indicates whether this is the main route table.
     *            </p>
     */
    public void setMain(Boolean main) {
        this.main = main;
    }

    /**
     * <p>
     * Indicates whether this is the main route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param main <p>
     *            Indicates whether this is the main route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociation withMain(Boolean main) {
        this.main = main;
        return this;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public String getRouteTableAssociationId() {
        return routeTableAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param routeTableAssociationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableAssociationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociation withRouteTableAssociationId(String routeTableAssociationId) {
        this.routeTableAssociationId = routeTableAssociationId;
        return this;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     *
     * @return <p>
     *         The ID of the route table.
     *         </p>
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     *
     * @param routeTableId <p>
     *            The ID of the route table.
     *            </p>
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routeTableId <p>
     *            The ID of the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociation withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit
     * association.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet. A subnet ID is not returned for an implicit
     *         association.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit
     * association.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet. A subnet ID is not returned for an
     *            implicit association.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet. A subnet ID is not returned for an implicit
     * association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet. A subnet ID is not returned for an
     *            implicit association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The ID of the internet gateway or virtual private gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the internet gateway or virtual private gateway.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The ID of the internet gateway or virtual private gateway.
     * </p>
     *
     * @param gatewayId <p>
     *            The ID of the internet gateway or virtual private gateway.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the internet gateway or virtual private gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayId <p>
     *            The ID of the internet gateway or virtual private gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTableAssociation withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
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
    public RouteTableAssociation withAssociationState(RouteTableAssociationState associationState) {
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
        if (getMain() != null)
            sb.append("Main: " + getMain() + ",");
        if (getRouteTableAssociationId() != null)
            sb.append("RouteTableAssociationId: " + getRouteTableAssociationId() + ",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getAssociationState() != null)
            sb.append("AssociationState: " + getAssociationState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMain() == null) ? 0 : getMain().hashCode());
        hashCode = prime
                * hashCode
                + ((getRouteTableAssociationId() == null) ? 0 : getRouteTableAssociationId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
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

        if (obj instanceof RouteTableAssociation == false)
            return false;
        RouteTableAssociation other = (RouteTableAssociation) obj;

        if (other.getMain() == null ^ this.getMain() == null)
            return false;
        if (other.getMain() != null && other.getMain().equals(this.getMain()) == false)
            return false;
        if (other.getRouteTableAssociationId() == null ^ this.getRouteTableAssociationId() == null)
            return false;
        if (other.getRouteTableAssociationId() != null
                && other.getRouteTableAssociationId().equals(this.getRouteTableAssociationId()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null
                && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getAssociationState() == null ^ this.getAssociationState() == null)
            return false;
        if (other.getAssociationState() != null
                && other.getAssociationState().equals(this.getAssociationState()) == false)
            return false;
        return true;
    }
}
