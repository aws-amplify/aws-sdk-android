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
 * Describes a route for a local gateway route table.
 * </p>
 */
public class LocalGatewayRoute implements Serializable {
    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     */
    private String type;

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     */
    private String state;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     *
     * @return <p>
     *         The CIDR block used for destination matches.
     *         </p>
     */
    public String getDestinationCidrBlock() {
        return destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     *
     * @param destinationCidrBlock <p>
     *            The CIDR block used for destination matches.
     *            </p>
     */
    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationCidrBlock <p>
     *            The CIDR block used for destination matches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LocalGatewayRoute withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
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
    public LocalGatewayRoute withLocalGatewayVirtualInterfaceGroupId(
            String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     *
     * @return <p>
     *         The route type.
     *         </p>
     * @see LocalGatewayRouteType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     *
     * @param type <p>
     *            The route type.
     *            </p>
     * @see LocalGatewayRouteType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     *
     * @param type <p>
     *            The route type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocalGatewayRouteType
     */
    public LocalGatewayRoute withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     *
     * @param type <p>
     *            The route type.
     *            </p>
     * @see LocalGatewayRouteType
     */
    public void setType(LocalGatewayRouteType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The route type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>static, propagated
     *
     * @param type <p>
     *            The route type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocalGatewayRouteType
     */
    public LocalGatewayRoute withType(LocalGatewayRouteType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     *
     * @return <p>
     *         The state of the route.
     *         </p>
     * @see LocalGatewayRouteState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     *
     * @param state <p>
     *            The state of the route.
     *            </p>
     * @see LocalGatewayRouteState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     *
     * @param state <p>
     *            The state of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocalGatewayRouteState
     */
    public LocalGatewayRoute withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     *
     * @param state <p>
     *            The state of the route.
     *            </p>
     * @see LocalGatewayRouteState
     */
    public void setState(LocalGatewayRouteState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the route.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, active, blackhole, deleting, deleted
     *
     * @param state <p>
     *            The state of the route.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocalGatewayRouteState
     */
    public LocalGatewayRoute withState(LocalGatewayRouteState state) {
        this.state = state.toString();
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
    public LocalGatewayRoute withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: " + getDestinationCidrBlock() + ",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: "
                    + getLocalGatewayVirtualInterfaceGroupId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: " + getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0
                        : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalGatewayRoute == false)
            return false;
        LocalGatewayRoute other = (LocalGatewayRoute) obj;

        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null
                ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(
                        this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null
                ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null
                && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }
}
