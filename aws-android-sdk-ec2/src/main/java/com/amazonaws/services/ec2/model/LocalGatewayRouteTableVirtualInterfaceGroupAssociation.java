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
 * Describes an association between a local gateway route table and a virtual
 * interface group.
 * </p>
 */
public class LocalGatewayRouteTableVirtualInterfaceGroupAssociation implements Serializable {
    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String localGatewayRouteTableVirtualInterfaceGroupAssociationId;

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @return <p>
     *         The ID of the association.
     *         </p>
     */
    public String getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() {
        return localGatewayRouteTableVirtualInterfaceGroupAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     *
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationId <p>
     *            The ID of the association.
     *            </p>
     */
    public void setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(
            String localGatewayRouteTableVirtualInterfaceGroupAssociationId) {
        this.localGatewayRouteTableVirtualInterfaceGroupAssociationId = localGatewayRouteTableVirtualInterfaceGroupAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationId <p>
     *            The ID of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(
            String localGatewayRouteTableVirtualInterfaceGroupAssociationId) {
        this.localGatewayRouteTableVirtualInterfaceGroupAssociationId = localGatewayRouteTableVirtualInterfaceGroupAssociationId;
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     *
     * @return <p>
     *         The ID of the virtual interface group.
     *         </p>
     */
    public String getLocalGatewayVirtualInterfaceGroupId() {
        return localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     *
     * @param localGatewayVirtualInterfaceGroupId <p>
     *            The ID of the virtual interface group.
     *            </p>
     */
    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayVirtualInterfaceGroupId <p>
     *            The ID of the virtual interface group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayVirtualInterfaceGroupId(
            String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway.
     *         </p>
     */
    public String getLocalGatewayId() {
        return localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     */
    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayId <p>
     *            The ID of the local gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayId(
            String localGatewayId) {
        this.localGatewayId = localGatewayId;
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway route table.
     *         </p>
     */
    public String getLocalGatewayRouteTableId() {
        return localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     */
    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayRouteTableId(
            String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
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
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param state <p>
     *            The state of the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     *
     * @return <p>
     *         The tags assigned to the association.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     *
     * @param tags <p>
     *            The tags assigned to the association.
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
     * The tags assigned to the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withTags(Tag... tags) {
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
     * The tags assigned to the association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags assigned to the association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withTags(
            java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() != null)
            sb.append("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: "
                    + getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() + ",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: "
                    + getLocalGatewayVirtualInterfaceGroupId() + ",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: " + getLocalGatewayId() + ",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: " + getLocalGatewayRouteTableId() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
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
                + ((getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null) ? 0
                        : getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0
                        : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId()
                        .hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayRouteTableVirtualInterfaceGroupAssociation == false)
            return false;
        LocalGatewayRouteTableVirtualInterfaceGroupAssociation other = (LocalGatewayRouteTableVirtualInterfaceGroupAssociation) obj;

        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null
                ^ this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null)
            return false;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() != null
                && other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId().equals(
                        this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null
                ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(
                        this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null
                && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null
                ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null
                && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
