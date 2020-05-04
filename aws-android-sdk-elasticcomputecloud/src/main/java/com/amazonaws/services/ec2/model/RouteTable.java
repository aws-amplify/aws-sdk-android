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
 * Describes a route table.
 * </p>
 */
public class RouteTable implements Serializable {
    /**
     * <p>
     * The associations between the route table and one or more subnets or a
     * gateway.
     * </p>
     */
    private java.util.List<RouteTableAssociation> associations;

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     */
    private java.util.List<PropagatingVgw> propagatingVgws;

    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;

    /**
     * <p>
     * The routes in the route table.
     * </p>
     */
    private java.util.List<Route> routes;

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The associations between the route table and one or more subnets or a
     * gateway.
     * </p>
     *
     * @return <p>
     *         The associations between the route table and one or more subnets
     *         or a gateway.
     *         </p>
     */
    public java.util.List<RouteTableAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets or a
     * gateway.
     * </p>
     *
     * @param associations <p>
     *            The associations between the route table and one or more
     *            subnets or a gateway.
     *            </p>
     */
    public void setAssociations(java.util.Collection<RouteTableAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<RouteTableAssociation>(associations);
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets or a
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            The associations between the route table and one or more
     *            subnets or a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withAssociations(RouteTableAssociation... associations) {
        if (getAssociations() == null) {
            this.associations = new java.util.ArrayList<RouteTableAssociation>(associations.length);
        }
        for (RouteTableAssociation value : associations) {
            this.associations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The associations between the route table and one or more subnets or a
     * gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associations <p>
     *            The associations between the route table and one or more
     *            subnets or a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withAssociations(java.util.Collection<RouteTableAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     *
     * @return <p>
     *         Any virtual private gateway (VGW) propagating routes.
     *         </p>
     */
    public java.util.List<PropagatingVgw> getPropagatingVgws() {
        return propagatingVgws;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     *
     * @param propagatingVgws <p>
     *            Any virtual private gateway (VGW) propagating routes.
     *            </p>
     */
    public void setPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        if (propagatingVgws == null) {
            this.propagatingVgws = null;
            return;
        }

        this.propagatingVgws = new java.util.ArrayList<PropagatingVgw>(propagatingVgws);
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propagatingVgws <p>
     *            Any virtual private gateway (VGW) propagating routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withPropagatingVgws(PropagatingVgw... propagatingVgws) {
        if (getPropagatingVgws() == null) {
            this.propagatingVgws = new java.util.ArrayList<PropagatingVgw>(propagatingVgws.length);
        }
        for (PropagatingVgw value : propagatingVgws) {
            this.propagatingVgws.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any virtual private gateway (VGW) propagating routes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param propagatingVgws <p>
     *            Any virtual private gateway (VGW) propagating routes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withPropagatingVgws(java.util.Collection<PropagatingVgw> propagatingVgws) {
        setPropagatingVgws(propagatingVgws);
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
    public RouteTable withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     *
     * @return <p>
     *         The routes in the route table.
     *         </p>
     */
    public java.util.List<Route> getRoutes() {
        return routes;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     *
     * @param routes <p>
     *            The routes in the route table.
     *            </p>
     */
    public void setRoutes(java.util.Collection<Route> routes) {
        if (routes == null) {
            this.routes = null;
            return;
        }

        this.routes = new java.util.ArrayList<Route>(routes);
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The routes in the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withRoutes(Route... routes) {
        if (getRoutes() == null) {
            this.routes = new java.util.ArrayList<Route>(routes.length);
        }
        for (Route value : routes) {
            this.routes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The routes in the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routes <p>
     *            The routes in the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withRoutes(java.util.Collection<Route> routes) {
        setRoutes(routes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the route table.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the route table.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @return <p>
     *         The ID of the VPC.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            The ID of the VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the route table.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the route table.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The ID of the AWS account that owns the route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RouteTable withOwnerId(String ownerId) {
        this.ownerId = ownerId;
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
        if (getAssociations() != null)
            sb.append("Associations: " + getAssociations() + ",");
        if (getPropagatingVgws() != null)
            sb.append("PropagatingVgws: " + getPropagatingVgws() + ",");
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getRoutes() != null)
            sb.append("Routes: " + getRoutes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode
                + ((getPropagatingVgws() == null) ? 0 : getPropagatingVgws().hashCode());
        hashCode = prime * hashCode
                + ((getRouteTableId() == null) ? 0 : getRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getRoutes() == null) ? 0 : getRoutes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteTable == false)
            return false;
        RouteTable other = (RouteTable) obj;

        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null
                && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getPropagatingVgws() == null ^ this.getPropagatingVgws() == null)
            return false;
        if (other.getPropagatingVgws() != null
                && other.getPropagatingVgws().equals(this.getPropagatingVgws()) == false)
            return false;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null
                && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getRoutes() == null ^ this.getRoutes() == null)
            return false;
        if (other.getRoutes() != null && other.getRoutes().equals(this.getRoutes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }
}
