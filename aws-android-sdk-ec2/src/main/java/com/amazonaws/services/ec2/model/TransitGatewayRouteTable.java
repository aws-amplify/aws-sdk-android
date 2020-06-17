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
 * Describes a transit gateway route table.
 * </p>
 */
public class TransitGatewayRouteTable implements Serializable {
    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * Indicates whether this is the default association route table for the
     * transit gateway.
     * </p>
     */
    private Boolean defaultAssociationRouteTable;

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the
     * transit gateway.
     * </p>
     */
    private Boolean defaultPropagationRouteTable;

    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway route table.
     *         </p>
     */
    public String getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the transit gateway route table.
     *            </p>
     */
    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the transit gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRouteTable withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the transit gateway.
     *         </p>
     */
    public String getTransitGatewayId() {
        return transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     */
    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayId <p>
     *            The ID of the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRouteTable withTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The state of the transit gateway route table.
     *         </p>
     * @see TransitGatewayRouteTableState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway route table.
     *            </p>
     * @see TransitGatewayRouteTableState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayRouteTableState
     */
    public TransitGatewayRouteTable withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway route table.
     *            </p>
     * @see TransitGatewayRouteTableState
     */
    public void setState(TransitGatewayRouteTableState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param state <p>
     *            The state of the transit gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayRouteTableState
     */
    public TransitGatewayRouteTable withState(TransitGatewayRouteTableState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the
     * transit gateway.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default association route table for
     *         the transit gateway.
     *         </p>
     */
    public Boolean isDefaultAssociationRouteTable() {
        return defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the
     * transit gateway.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default association route table for
     *         the transit gateway.
     *         </p>
     */
    public Boolean getDefaultAssociationRouteTable() {
        return defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the
     * transit gateway.
     * </p>
     *
     * @param defaultAssociationRouteTable <p>
     *            Indicates whether this is the default association route table
     *            for the transit gateway.
     *            </p>
     */
    public void setDefaultAssociationRouteTable(Boolean defaultAssociationRouteTable) {
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the
     * transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultAssociationRouteTable <p>
     *            Indicates whether this is the default association route table
     *            for the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRouteTable withDefaultAssociationRouteTable(
            Boolean defaultAssociationRouteTable) {
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the
     * transit gateway.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default propagation route table for
     *         the transit gateway.
     *         </p>
     */
    public Boolean isDefaultPropagationRouteTable() {
        return defaultPropagationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the
     * transit gateway.
     * </p>
     *
     * @return <p>
     *         Indicates whether this is the default propagation route table for
     *         the transit gateway.
     *         </p>
     */
    public Boolean getDefaultPropagationRouteTable() {
        return defaultPropagationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the
     * transit gateway.
     * </p>
     *
     * @param defaultPropagationRouteTable <p>
     *            Indicates whether this is the default propagation route table
     *            for the transit gateway.
     *            </p>
     */
    public void setDefaultPropagationRouteTable(Boolean defaultPropagationRouteTable) {
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the
     * transit gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultPropagationRouteTable <p>
     *            Indicates whether this is the default propagation route table
     *            for the transit gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRouteTable withDefaultPropagationRouteTable(
            Boolean defaultPropagationRouteTable) {
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @return <p>
     *         The creation time.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRouteTable withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
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
    public TransitGatewayRouteTable withTags(Tag... tags) {
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
    public TransitGatewayRouteTable withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: " + getTransitGatewayRouteTableId() + ",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: " + getTransitGatewayId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDefaultAssociationRouteTable() != null)
            sb.append("DefaultAssociationRouteTable: " + getDefaultAssociationRouteTable() + ",");
        if (getDefaultPropagationRouteTable() != null)
            sb.append("DefaultPropagationRouteTable: " + getDefaultPropagationRouteTable() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultAssociationRouteTable() == null) ? 0
                        : getDefaultAssociationRouteTable().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultPropagationRouteTable() == null) ? 0
                        : getDefaultPropagationRouteTable().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRouteTable == false)
            return false;
        TransitGatewayRouteTable other = (TransitGatewayRouteTable) obj;

        if (other.getTransitGatewayRouteTableId() == null
                ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null
                && other.getTransitGatewayRouteTableId().equals(
                        this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null
                && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDefaultAssociationRouteTable() == null
                ^ this.getDefaultAssociationRouteTable() == null)
            return false;
        if (other.getDefaultAssociationRouteTable() != null
                && other.getDefaultAssociationRouteTable().equals(
                        this.getDefaultAssociationRouteTable()) == false)
            return false;
        if (other.getDefaultPropagationRouteTable() == null
                ^ this.getDefaultPropagationRouteTable() == null)
            return false;
        if (other.getDefaultPropagationRouteTable() != null
                && other.getDefaultPropagationRouteTable().equals(
                        this.getDefaultPropagationRouteTable()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
