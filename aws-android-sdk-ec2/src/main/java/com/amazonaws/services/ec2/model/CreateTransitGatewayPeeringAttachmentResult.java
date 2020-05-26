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

public class CreateTransitGatewayPeeringAttachmentResult implements Serializable {
    /**
     * <p>
     * The transit gateway peering attachment.
     * </p>
     */
    private TransitGatewayPeeringAttachment transitGatewayPeeringAttachment;

    /**
     * <p>
     * The transit gateway peering attachment.
     * </p>
     *
     * @return <p>
     *         The transit gateway peering attachment.
     *         </p>
     */
    public TransitGatewayPeeringAttachment getTransitGatewayPeeringAttachment() {
        return transitGatewayPeeringAttachment;
    }

    /**
     * <p>
     * The transit gateway peering attachment.
     * </p>
     *
     * @param transitGatewayPeeringAttachment <p>
     *            The transit gateway peering attachment.
     *            </p>
     */
    public void setTransitGatewayPeeringAttachment(
            TransitGatewayPeeringAttachment transitGatewayPeeringAttachment) {
        this.transitGatewayPeeringAttachment = transitGatewayPeeringAttachment;
    }

    /**
     * <p>
     * The transit gateway peering attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitGatewayPeeringAttachment <p>
     *            The transit gateway peering attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTransitGatewayPeeringAttachmentResult withTransitGatewayPeeringAttachment(
            TransitGatewayPeeringAttachment transitGatewayPeeringAttachment) {
        this.transitGatewayPeeringAttachment = transitGatewayPeeringAttachment;
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
        if (getTransitGatewayPeeringAttachment() != null)
            sb.append("TransitGatewayPeeringAttachment: " + getTransitGatewayPeeringAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransitGatewayPeeringAttachment() == null) ? 0
                        : getTransitGatewayPeeringAttachment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransitGatewayPeeringAttachmentResult == false)
            return false;
        CreateTransitGatewayPeeringAttachmentResult other = (CreateTransitGatewayPeeringAttachmentResult) obj;

        if (other.getTransitGatewayPeeringAttachment() == null
                ^ this.getTransitGatewayPeeringAttachment() == null)
            return false;
        if (other.getTransitGatewayPeeringAttachment() != null
                && other.getTransitGatewayPeeringAttachment().equals(
                        this.getTransitGatewayPeeringAttachment()) == false)
            return false;
        return true;
    }
}
