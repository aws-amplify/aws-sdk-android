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
 * Describes the subnet association with the transit gateway multicast domain.
 * </p>
 */
public class SubnetAssociation implements Serializable {
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     */
    private String state;

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @return <p>
     *         The ID of the subnet.
     *         </p>
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subnetId <p>
     *            The ID of the subnet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubnetAssociation withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @return <p>
     *         The state of the subnet association.
     *         </p>
     * @see TransitGatewayMulitcastDomainAssociationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the subnet association.
     *            </p>
     * @see TransitGatewayMulitcastDomainAssociationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the subnet association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayMulitcastDomainAssociationState
     */
    public SubnetAssociation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the subnet association.
     *            </p>
     * @see TransitGatewayMulitcastDomainAssociationState
     */
    public void setState(TransitGatewayMulitcastDomainAssociationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the subnet association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>associating, associated, disassociating,
     * disassociated
     *
     * @param state <p>
     *            The state of the subnet association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitGatewayMulitcastDomainAssociationState
     */
    public SubnetAssociation withState(TransitGatewayMulitcastDomainAssociationState state) {
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
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubnetAssociation == false)
            return false;
        SubnetAssociation other = (SubnetAssociation) obj;

        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
