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
 * Describes a propagation route table.
 * </p>
 */
public class TransitGatewayAttachmentPropagation implements Serializable {
    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     */
    private String transitGatewayRouteTableId;

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     */
    private String state;

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     *
     * @return <p>
     *         The ID of the propagation route table.
     *         </p>
     */
    public String getTransitGatewayRouteTableId() {
        return transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the propagation route table.
     *            </p>
     */
    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayRouteTableId <p>
     *            The ID of the propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransitGatewayAttachmentPropagation withTransitGatewayRouteTableId(
            String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
        return this;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     *
     * @return <p>
     *         The state of the propagation route table.
     *         </p>
     * @see TransitGatewayPropagationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of the propagation route table.
     *            </p>
     * @see TransitGatewayPropagationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of the propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayPropagationState
     */
    public TransitGatewayAttachmentPropagation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of the propagation route table.
     *            </p>
     * @see TransitGatewayPropagationState
     */
    public void setState(TransitGatewayPropagationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the propagation route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>enabling, enabled, disabling, disabled
     *
     * @param state <p>
     *            The state of the propagation route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayPropagationState
     */
    public TransitGatewayAttachmentPropagation withState(TransitGatewayPropagationState state) {
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: " + getTransitGatewayRouteTableId() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
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
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayAttachmentPropagation == false)
            return false;
        TransitGatewayAttachmentPropagation other = (TransitGatewayAttachmentPropagation) obj;

        if (other.getTransitGatewayRouteTableId() == null
                ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null
                && other.getTransitGatewayRouteTableId().equals(
                        this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
