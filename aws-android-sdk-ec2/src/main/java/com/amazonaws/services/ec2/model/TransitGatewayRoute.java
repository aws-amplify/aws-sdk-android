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
 * Describes a route for a transit gateway route table.
 * </p>
 */
public class TransitGatewayRoute implements Serializable {
    /**
     * <p>
     * The CIDR block used for destination matches.
     * </p>
     */
    private String destinationCidrBlock;

    /**
     * <p>
     * The attachments.
     * </p>
     */
    private java.util.List<TransitGatewayRouteAttachment> transitGatewayAttachments;

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
    public TransitGatewayRoute withDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     *
     * @return <p>
     *         The attachments.
     *         </p>
     */
    public java.util.List<TransitGatewayRouteAttachment> getTransitGatewayAttachments() {
        return transitGatewayAttachments;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     *
     * @param transitGatewayAttachments <p>
     *            The attachments.
     *            </p>
     */
    public void setTransitGatewayAttachments(
            java.util.Collection<TransitGatewayRouteAttachment> transitGatewayAttachments) {
        if (transitGatewayAttachments == null) {
            this.transitGatewayAttachments = null;
            return;
        }

        this.transitGatewayAttachments = new java.util.ArrayList<TransitGatewayRouteAttachment>(
                transitGatewayAttachments);
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachments <p>
     *            The attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRoute withTransitGatewayAttachments(
            TransitGatewayRouteAttachment... transitGatewayAttachments) {
        if (getTransitGatewayAttachments() == null) {
            this.transitGatewayAttachments = new java.util.ArrayList<TransitGatewayRouteAttachment>(
                    transitGatewayAttachments.length);
        }
        for (TransitGatewayRouteAttachment value : transitGatewayAttachments) {
            this.transitGatewayAttachments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attachments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayAttachments <p>
     *            The attachments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayRoute withTransitGatewayAttachments(
            java.util.Collection<TransitGatewayRouteAttachment> transitGatewayAttachments) {
        setTransitGatewayAttachments(transitGatewayAttachments);
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
     * @see TransitGatewayRouteType
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
     * @see TransitGatewayRouteType
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
     * @see TransitGatewayRouteType
     */
    public TransitGatewayRoute withType(String type) {
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
     * @see TransitGatewayRouteType
     */
    public void setType(TransitGatewayRouteType type) {
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
     * @see TransitGatewayRouteType
     */
    public TransitGatewayRoute withType(TransitGatewayRouteType type) {
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
     * @see TransitGatewayRouteState
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
     * @see TransitGatewayRouteState
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
     * @see TransitGatewayRouteState
     */
    public TransitGatewayRoute withState(String state) {
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
     * @see TransitGatewayRouteState
     */
    public void setState(TransitGatewayRouteState state) {
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
     * @see TransitGatewayRouteState
     */
    public TransitGatewayRoute withState(TransitGatewayRouteState state) {
        this.state = state.toString();
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
        if (getTransitGatewayAttachments() != null)
            sb.append("TransitGatewayAttachments: " + getTransitGatewayAttachments() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
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
                + ((getTransitGatewayAttachments() == null) ? 0 : getTransitGatewayAttachments()
                        .hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayRoute == false)
            return false;
        TransitGatewayRoute other = (TransitGatewayRoute) obj;

        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null
                && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getTransitGatewayAttachments() == null
                ^ this.getTransitGatewayAttachments() == null)
            return false;
        if (other.getTransitGatewayAttachments() != null
                && other.getTransitGatewayAttachments().equals(this.getTransitGatewayAttachments()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
