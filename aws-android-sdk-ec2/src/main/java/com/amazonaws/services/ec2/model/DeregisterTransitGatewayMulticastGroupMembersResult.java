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

public class DeregisterTransitGatewayMulticastGroupMembersResult implements Serializable {
    /**
     * <p>
     * Information about the deregistered members.
     * </p>
     */
    private TransitGatewayMulticastDeregisteredGroupMembers deregisteredMulticastGroupMembers;

    /**
     * <p>
     * Information about the deregistered members.
     * </p>
     *
     * @return <p>
     *         Information about the deregistered members.
     *         </p>
     */
    public TransitGatewayMulticastDeregisteredGroupMembers getDeregisteredMulticastGroupMembers() {
        return deregisteredMulticastGroupMembers;
    }

    /**
     * <p>
     * Information about the deregistered members.
     * </p>
     *
     * @param deregisteredMulticastGroupMembers <p>
     *            Information about the deregistered members.
     *            </p>
     */
    public void setDeregisteredMulticastGroupMembers(
            TransitGatewayMulticastDeregisteredGroupMembers deregisteredMulticastGroupMembers) {
        this.deregisteredMulticastGroupMembers = deregisteredMulticastGroupMembers;
    }

    /**
     * <p>
     * Information about the deregistered members.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deregisteredMulticastGroupMembers <p>
     *            Information about the deregistered members.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeregisterTransitGatewayMulticastGroupMembersResult withDeregisteredMulticastGroupMembers(
            TransitGatewayMulticastDeregisteredGroupMembers deregisteredMulticastGroupMembers) {
        this.deregisteredMulticastGroupMembers = deregisteredMulticastGroupMembers;
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
        if (getDeregisteredMulticastGroupMembers() != null)
            sb.append("DeregisteredMulticastGroupMembers: "
                    + getDeregisteredMulticastGroupMembers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeregisteredMulticastGroupMembers() == null) ? 0
                        : getDeregisteredMulticastGroupMembers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterTransitGatewayMulticastGroupMembersResult == false)
            return false;
        DeregisterTransitGatewayMulticastGroupMembersResult other = (DeregisterTransitGatewayMulticastGroupMembersResult) obj;

        if (other.getDeregisteredMulticastGroupMembers() == null
                ^ this.getDeregisteredMulticastGroupMembers() == null)
            return false;
        if (other.getDeregisteredMulticastGroupMembers() != null
                && other.getDeregisteredMulticastGroupMembers().equals(
                        this.getDeregisteredMulticastGroupMembers()) == false)
            return false;
        return true;
    }
}
